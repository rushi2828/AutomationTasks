package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassOne {
	
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    //	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();

			String baseUrl = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=t0O6WqvJHIWh8weFgrOIBw";
			String expectedTitle = "Google";
			String actualTitle = "";

			
			//Launch firefox driver and go to url
			driver.get(baseUrl);
			
			//Actual result
			actualTitle =  driver.getTitle();
			
			/*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
			
			
	 }
}
