import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import example.HelloWorld;

public class IntegrationTest77 {

  @Test
  public void test() {
    Set<String> set = new HashSet<>();
    readFileIntoSet(set, "2000-census-surnames.txt");
    System.out.println(HelloWorld.string + ". Test done. Random name for you pleasure: " + set.iterator().next());
  }

  private void readFileIntoSet(Set<String> set, String resource) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(IntegrationTest77.class.getClassLoader().getResourceAsStream(resource)));
    String line;
    try {
      while ((line = reader.readLine()) != null) {
        set.add(line.toLowerCase());
        set.add(line.toLowerCase() + "2");
        set.add(line.toLowerCase() + "3");
        set.add(line.toLowerCase() + "4");
        set.add(line.toLowerCase() + "5");
        set.add(line.toLowerCase() + "6");
        set.add(line.toLowerCase() + "7");
        set.add(line.toLowerCase() + "8");
        set.add(line.toLowerCase() + "9");
      }
    } catch(Exception e) {
      throw new RuntimeException(e);
    }    
  }

}
