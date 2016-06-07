package ExecutableMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class notifications{

	public static void fillNotificationBox(String s, WebDriver driver){
		
		Actions builder = new Actions(driver);
		WebElement textBox = driver.findElement(By.name("notificationTextArea"));
		//fill in username
		builder.moveToElement(textBox).click().sendKeys(s).perform();
		
	}
	
	public static void selectUsers(String s, WebDriver driver){
		String str = s.toLowerCase();
		if(str.equals("all") || str.equals("checkall") || str.equals("check all")){
			driver.findElement(By.name("checkAll")).click();
		}else if(str.equals("uncheckall") || str.equals("uncheck all") || str.equals("uncheck")){
			driver.findElement(By.name("uncheckAll"));
		}else{
			System.out.println("Incorrect input in method selectUsers(String s): '" + str + "'");
		}
		
	}
	public static void selectUsers(String [] users, WebDriver driver){
		
		int rowCount = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr/td")).size();
		System.out.println(rowCount);
		System.out.println(driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr/td[1]/a")).getText());
		for(int i = 1; i < rowCount + 2; i++){
			//System.out.println(driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr/td[" + i + "]/a")).getText());
		}
		//*[@id="datatable"]/form/table/tbody/tr/td[1]/a
		
	}
	
	public static void sendNotification(WebDriver driver){
		
		
		
	}
	
}
