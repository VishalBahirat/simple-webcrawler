/**
 * 
 */
package crawler.steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import crawler.pages.HomePage;
import net.thucydides.core.annotations.Step;

/**
 * @author Vishal Bahirat
 *
 */
public class CrawlerSteps {

	HomePage homePage;

	@Step
	public void opens_prudential_homepage() {
		homePage.open();
	}

	@Step
	public void searches_for_contacts_link() {
		homePage.searchContactsLink();
	}

	@Step
	public void should_crawl_into_contacts_link() {
		try {
			Document document = Jsoup.connect("https://www.prudential.co.uk/contacts/general").get();
			assertNotNull(document);
		} catch (IOException e) {
			e.printStackTrace();
			assertFalse(false);
		}

	}

}
