package executableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class PagelessActions extends Notifications{
	
	public static void login(String username, String password, WebDriver driver) {
		//loadapp.iformbuilder.com sign in button is different
		driver.findElement(By.xpath("//img[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/sign_in.png']")).click();
		Actions builder = new Actions(driver);
		driver.findElement(By.name("USERNAME")).sendKeys(username);
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
		//log in
		driver.findElement(By.xpath("//input[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/login.png']")).click();
	}
	
	public static void logout(WebDriver driver){
		driver.findElement(By.xpath("//img[@src='https://iform-artwork.s3.amazonaws.com/load.iformbuilder.com/logout.png']")).click();
	}

	
	public static void navigateTo(String tabName, WebDriver driver){
		if(tabName.toLowerCase().equals("data")){
			driver.findElement(By.linkText("Data")).click();
		}else if(tabName.toLowerCase().equals("form assignment")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Assignment")).click();			
		}else if(tabName.toLowerCase().equals("form builder")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Builder")).click();
		}else if(tabName.toLowerCase().equals("form group")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Group")).click();
		}else if(tabName.toLowerCase().equals("localization")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Localization")).click();
		}else if(tabName.toLowerCase().equals("scoring")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Scoring")).click();
		}else if(tabName.toLowerCase().equals("package builder")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Form Packages")).click();
			driver.findElement(By.linkText("Package Builder")).click();
		}else if(tabName.toLowerCase().equals("package import")){
			driver.findElement(By.linkText("Forms")).click();
			driver.findElement(By.linkText("Package Import")).click();
		}else if(tabName.toLowerCase().equals("notifications")){
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Notifications")).click();
		}else if(tabName.toLowerCase().equals("add user")){
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Add/Edit Users")).click();
		}else if(tabName.toLowerCase().equals("edit user")){
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("Add/Edit Users")).click();
		}else if(tabName.toLowerCase().equals("my profile")){
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("My Profile")).click();
		}else if(tabName.toLowerCase().equals("user group")){
			driver.findElement(By.linkText("Users")).click();
			driver.findElement(By.linkText("User Group")).click();
		}else if(tabName.toLowerCase().equals("company info")){
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("Company Info")).click();
		}else if(tabName.toLowerCase().equals("license")){
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("License")).click();		
		}else if(tabName.toLowerCase().equals("api apps")){
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("API Apps")).click();
		}else if(tabName.toLowerCase().equals("billing info")){
			driver.findElement(By.linkText("Company")).click();
			driver.findElement(By.linkText("Billing")).click();		
		}else if(tabName.toLowerCase().equals("fb v2")){
			driver.findElement(By.linkText("Support")).click();
			driver.findElement(By.linkText("FB V2")).click();
		}else if(tabName.toLowerCase().equals("ol v2")){
			driver.findElement(By.linkText("Support")).click();
			driver.findElement(By.linkText("OL V2")).click();
		}else if(tabName.toLowerCase().equals("home")){
			driver.get("https://loadapp.iformbuilder.com/");
		}else if(tabName.toLowerCase().equals("homepage")){
			driver.get("https://loadapp.iformbuilder.com/");
		}else{
			System.out.println("method \'navigateTo\' in pagelessActions.java incorrect input \'" + tabName + "\'");
		}
	}
}
