package com.code.selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/SeleniumEsT/workspace/SeleniumFundamental/src/HandlingAlert.html");
		driver.findElement(By.id("submit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("alert Message :"+alert.getText());
		//alert.accept(); //To click on Ok button
		
		//To Check alert isPresent or Not
		boolean found = false;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		try{
			wait.until(ExpectedConditions.alertIsPresent());
			found = true;
		}catch(Exception eTO){
			eTO.printStackTrace();
		}
		System.out.println("alertIsPresent : "+ found);	
	}
}
