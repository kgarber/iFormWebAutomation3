package ExecutableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class pagelessActions extends notifications{
	
	public static void login(String username, String password, WebDriver driver){
		driver.findElement(By.xpath("//img[@src='http://www.iformbuilder.com/wp-content/uploads/2013/12/sign_in_2014.png']")).click();
		Actions builder = new Actions(driver);
		WebElement webUsername = driver.findElement(By.name("USERNAME"));
		WebElement webPassword = driver.findElement(By.name("PASSWORD"));
		//fill in username
		builder.moveToElement(webUsername).click().sendKeys(username).perform();
		//fill in password
		builder.moveToElement(webPassword).click().sendKeys(password).perform();
		//log in
		driver.findElement(By.xpath("//input[@src='https://iform-artwork.s3.amazonaws.com/iformbuilder.com/login.png']")).click();
	}
	
	public static void logout(WebDriver driver){
		driver.findElement(By.xpath("//img[@src='https://iform-artwork.s3.amazonaws.com/iformbuilder.com/logout.png']")).click();
	}
	
	public static void navigateTo(String tabName, WebDriver driver){
		if(tabName.toLowerCase().equals("data")){
			driver.get("https://app.iformbuilder.com/exzact/dataViews.php");
		}else if(tabName.toLowerCase().equals("form assignment")){
			driver.get("https://app.iformbuilder.com/exzact/adminAssignment.php");
		}else if(tabName.toLowerCase().equals("form builder")){
			driver.get("https://app.iformbuilder.com/exzact/adminFormBuilder.php");
		}else if(tabName.toLowerCase().equals("form group")){
			driver.get("https://app.iformbuilder.com/exzact/adminFormGroup.php");
		}else if(tabName.toLowerCase().equals("localization")){
			driver.get("https://app.iformbuilder.com/exzact/adminFormLocalization.php");
		}else if(tabName.toLowerCase().equals("scoring")){
			driver.get("https://app.iformbuilder.com/exzact/adminFormScoring.php");
		}else if(tabName.toLowerCase().equals("package builder")){
			driver.get("https://app.iformbuilder.com/exzact/formPackageBuilder.php");
		}else if(tabName.toLowerCase().equals("package import")){
			driver.get("https://app.iformbuilder.com/exzact/formPackageImport.php");
		}else if(tabName.toLowerCase().equals("notifications")){
			driver.get("https://app.iformbuilder.com/exzact/adminNotification.php");
		}else if(tabName.toLowerCase().equals("add user")){
			driver.get("https://app.iformbuilder.com/exzact/adminUsers.php");
		}else if(tabName.toLowerCase().equals("edit user")){
			driver.get("https://app.iformbuilder.com/exzact/adminUsers.php");
		}else if(tabName.toLowerCase().equals("profile")){
			driver.get("https://app.iformbuilder.com/exzact/adminMyProfile.php");
		}else if(tabName.toLowerCase().equals("user group")){
			driver.get("https://app.iformbuilder.com/exzact/adminUserGroup.php");
		}else if(tabName.toLowerCase().equals("company info")){
			driver.get("https://app.iformbuilder.com/exzact/adminCompanyInfo.php");
		}else if(tabName.toLowerCase().equals("company license")){
			driver.get("https://app.iformbuilder.com/exzact/adminLicenseInfo.php");
		}else if(tabName.toLowerCase().equals("api apps")){
			driver.get("https://app.iformbuilder.com/exzact/adminApiApplications.php");
		}else if(tabName.toLowerCase().equals("billing info")){
			driver.get("https://app.iformbuilder.com/exzact/adminBillingInfo.php");
		}else if(tabName.toLowerCase().equals("knowledge base")){
			driver.get("https://iformbuilder.zendesk.com/home");
		}else if(tabName.toLowerCase().equals("community")){
			driver.get("https://iformbuilder.zendesk.com/hc/communities/public/topics?locale=en-us");
		}else if(tabName.toLowerCase().equals("home")){
			driver.get("https://www.iformbuilder.com/");
		}else if(tabName.toLowerCase().equals("homepage")){
			driver.get("https://www.iformbuilder.com/");
		}else{
			System.out.println("method \'clickTab\' incorrect input \'" + tabName + "\'");
		}
	}
}
