package ExecutableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class executableFile extends testCases {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		navigateTo("home", driver);
		login("cnl4fh@virginia.edu","1formPassword!",driver);
		navigateTo("notifications", driver);
		fillNotificationBox("hello there my name is christian", driver);
		String [] users = new String[5];
		selectUsers(users, driver);
		logout(driver);
		driver.quit();
		
	}

}
