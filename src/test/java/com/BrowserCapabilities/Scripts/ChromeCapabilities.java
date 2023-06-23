package com.BrowserCapabilities.Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeCapabilities 
{
	public static ChromeDriver getChromeDriver() {
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--start-maximized");
	    chromeOptions.addArguments("--remote-allow-origins=*");
	    return new ChromeDriver(chromeOptions);
	}

}
