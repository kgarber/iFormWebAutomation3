package executableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ExecutableFile extends TestCases {

	public static void main(String[] args) throws FileNotFoundException, UnhandledAlertException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
//		File configFile = new File("config.txt");
//		Scanner scanner = new Scanner(configFile);
//		String [] userInfo = new String[15];
//		for(int i = 0; i < 15; i++){
//			String [] configValues = scanner.nextLine().split("::");
//			userInfo[i] = configValues[1];
//			System.out.println(userInfo[i]);
//		}
		navigateTo("home", driver);
		//ALTER LOGIN CLASS DUE TO FEATURE FRENZY IMPORTANT!!!
		login("clastova@zerionsoftware.com","1formPassword!",driver);
		driver.navigate().refresh();
		Thread.sleep(2000);
		if(driver.switchTo().alert() != null){
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();
		    alert.accept(); // alert.accept(); alert.dismiss();
		}
		navigateTo("notifications", driver);
		fillNotificationBox("hello there my name is christian", driver);
		String user = "cnl4fh@virginia.edu";
		String [] users = new String[5];
		selectUser(user, driver);
		logout(driver);
		driver.quit();
		
	}

}
