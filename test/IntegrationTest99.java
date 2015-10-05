import static org.junit.Assert.assertTrue;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import play.libs.F.Callback;
import play.test.TestBrowser;

public class IntegrationTest99 {

  @Test
  public void test() {
    running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
      public void invoke(TestBrowser browser) {
        Set<String> set = new HashSet<>();
        readFileIntoSet(set, "2000-census-surnames.txt");
        browser.goTo("http://localhost:3333");
        assertTrue(browser.pageSource().contains("Your new application is ready."));
        System.out.println("Test done. Random name for you pleasure: " + set.iterator().next());
      }
    });
  }

  private void readFileIntoSet(Set<String> set, String resource) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(IntegrationTest99.class.getClassLoader().getResourceAsStream(resource)));
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
