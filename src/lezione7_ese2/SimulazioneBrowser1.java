package lezione7_ese2;

public class SimulazioneBrowser1 {
    public static void main(String[] args) {
        Browser1 browser = new Browser1();

        browser.goBack(); 

        browser.visitPage("https://www.google.com");
        browser.goBack();

        browser.visitPage("https://www.wikipedia.org");
        browser.visitPage("https://www.github.com");

        browser.goBack(); 

        browser.printHistory(); 
    }
}

