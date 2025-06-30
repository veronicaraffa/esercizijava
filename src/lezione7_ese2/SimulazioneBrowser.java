package lezione7_ese2;

public class SimulazioneBrowser 
{
	public static void main (String [] args) 
	{
		Browser browser= new Browser();
		
		browser.visitPage("https://www.google.com");
		browser.visitPage("https://www.wikipedia.org");
		browser.visitPage("https://www.github.com");
		
		System.out.println();
		
		browser.goBack();
		browser.goBack();
		
		System.out.println();

		browser.printHistory();
	}
}
