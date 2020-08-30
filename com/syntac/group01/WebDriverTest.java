package com.syntac.group01;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		//array of Objects of RemoteWebDrivertype
		RemoteWebDriver [] drivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
		
		for (RemoteWebDriver drivers:drivers) {
			
			System.out.println("====================================");
			
			drivers.open();
			drivers.close();
			drivers.navigate();
			drivers.getTitle();
			drivers.getScreenshot();
		}
		
		System.out.println("=======another array =============================");
		
		WebDriver [] drivers2 = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
		
		for (WebDriver drivers:drivers2) {
			
			System.out.println("====================================");
			
			drivers.open();
			drivers.close();
			drivers.navigate();
			drivers.getTitle();
			drivers.getScreenshot();
	}

}
