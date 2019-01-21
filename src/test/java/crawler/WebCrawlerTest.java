package crawler;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import crawler.steps.CrawlerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

/**
 * @author Vishal Bahirat
 *
 * We are using Serenity Framework for automation testing. Serenity is a BDD implementation of Automation Testing. 
 * This is the Runner class(starting point).
 * 
 * The Results can be viewed as an HTML report created under - "target\site\xxxxxxxxxxxxx.html" file
 * 
 * #TO-DO - create a 'features' folder and keep all features(like this one) inside it.
 * 
 * -> Right Click and run it as a Junit Test
 */

@RunWith(SerenityRunner.class)
public class WebCrawlerTest {

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	}

	@Managed(driver="chrome", uniqueSession=true)
	WebDriver driver;
	
	@Steps
	CrawlerSteps steps;

	@Test
	public void should_find_an_existing_link() {
		// GIVEN
		steps.opens_prudential_homepage();
		// WHEN
		steps.searches_for_contacts_link();
		// THEN
		steps.should_crawl_into_contacts_link();
	}
	
}
