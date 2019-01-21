/**
 * 
 */
package crawler.pages;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * @author Vishal Bahirat
 *
 */

@DefaultUrl("https://www.prudential.co.uk/")
public class HomePage extends PageObject{

	@FindBy(xpath="//*[@id=\"nav-contacts-level1\"]/a")
	WebElement contacts;
	
	public void searchContactsLink() {
		assertNotNull(contacts);
	}
}
