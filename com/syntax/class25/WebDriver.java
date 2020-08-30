package com.syntax.class25;

public class WebDriver {

	public void open () {
		System.out.println("opening brower");
	}
	
}

class FireFoxDriver extends WebDriver {
	
	public void open () {
		System.out.println("Opening firefox browser");
	}
}

class ChromeDriver extends WebDriver {
	
	public void open () {//override
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver {
	public void open() {
		System.out.println("Opening internet explorer");

	}
}
