package com.syntac.group01;

public interface WebDriver {
	
	void open();
	void close();
	public String getTitle();

}


interface TakesSchreenshot{
	
	String FILE_EXTENSION = ".jpg"; // constact variable, not changeable value and we have to initialize. We cannot add space and we put instead underscore _
	
	void getScreeshot();
	
	default void getFullScreen() {// we have to put default because we provide implementation because of JAVA8
		System.out.println("WE can take schreenshot of full screen");
	}
	
	static void getPartialScreen () {// we have to put static because we provide implementation because of JAVA8
		System.out.println("We can take schreen shot of spedific part of the screen");
	}
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
	
	void navigate ();
}
//interface TakesScreenshots extends RemoteWebDriver {
//	
//	void getScreenshot();
//}

class ChromeDriver implements RemoteWebDriver {
	String title;
	private String title;
	
	ChromeDriver (String title) {
		this.title = title;
	}
	
	public String getTitle () {
		return title;
	}
	
	public void navigate() {
		System.out.println("Chorme navigate");
	}
	public void open () {
		System.out.println("Chrome Open");
	}
	
	public void close () {
		System.out.println("Chrome close");
	}
	
}
class FirefoxDriver implements RemoteWebDriver {
	
	
}
class SafariDriver implements RemoteWebDriver{
	
}
