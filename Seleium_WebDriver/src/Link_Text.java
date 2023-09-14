public class Link_Text
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		const { Builder, By, Key, until } = require('selenium-webdriver');

		async function locateLinkByText() {
		  const driver = await new Builder().forBrowser('chrome').build();
		  try {
		    await driver.get('https://example.com');

		    // Locate a link by its exact text
		    const link = await driver.findElement(By.linkText('Learn more'));

		    // Perform an action on the located link (e.g., click)
		    await link.click();

		    // Wait for some time to see the effect (remove this in a real script)
		    await driver.sleep(3000);
		  } finally {
		    await driver.quit();
		  }
		}

		locateLinkByText();
		And here's how you can locate links by a partial text match using partialLinkText():

		javascript
		Copy code
		const { Builder, By, Key, until } = require('selenium-webdriver');

		async function locateLinkByPartialText() {
		  const driver = await new Builder().forBrowser('chrome').build();
		  try {
		    await driver.get('https://example.com');

		    // Locate a link by a partial text match
		    const link = await driver.findElement(By.partialLinkText('Learn'));

		    // Perform an action on the located link (e.g., click)
		    await link.click();

		    // Wait for some time to see the effect (remove this in a real script)
		    await driver.sleep(3000);
		  } finally {
		    await driver.quit();
		  }
		}

		locateLinkByPartialText();
	}
}