package com.Assignment2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MotorCycleProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php#");
		driver.findElement(By.linkText("Motorcycle")).click();
		
		driver.findElement(By.id("nav_automobile")).click();
		WebElement cars=driver.findElement(By.xpath("//*[@id='make']"));
		cars.click();
		Select make=new Select(cars);
		make.selectByIndex(4);
		
		
		//Engine Performance
		WebElement engine=driver.findElement(By.id("engineperformance"));
        engine.sendKeys("2000");
        
        //Manufacture date
        driver.findElement(By.id("opendateofmanufacturecalender")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[5]/td[4]/a")).click();
        
        //seats
        WebElement seat=driver.findElement(By.id("numberofseats"));
        seat.click();
        Select seats=new Select(seat);
      //  List<WebElement>seatList=seats.getOptions();
        seats.selectByValue("2");
        
        //Diesel
        WebElement fuel=driver.findElement(By.id("fuel"));
        fuel.click();
        Select type=new Select(fuel);
      //  List<WebElement>petrol=type.getOptions();
        type.selectByIndex(3);
        
      //$Price
        WebElement price=driver.findElement(By.id("listprice"));
        price.sendKeys("30000");
        
        //License plate number
        WebElement plate=driver.findElement(By.id("licenseplatenumber"));
        plate.sendKeys("MH34AR0909");
        
        //Annual mileage
        WebElement mileage=driver.findElement(By.id("annualmileage"));
        mileage.sendKeys("50000");
        
        //Next page
        driver.findElement(By.id("nextenterinsurantdata")).click();
        
      //First name
        driver.findElement(By.id("firstname")).sendKeys("Harshal");
        
        //Last name
        driver.findElement(By.id("lastname")).sendKeys("Ramteke");
        
        //DOB
        driver.findElement(By.id("birthdate")).sendKeys("09/14/1998");
        
        
       //Gender
        //WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p"));
        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
        
        //Street Address
       driver.findElement(By.id("streetaddress")).sendKeys("Lumbini Nagar,Chandrapur");
       
       //Country
       WebElement country=driver.findElement(By.id("country"));
       Select countries=new Select(country);
       countries.selectByValue("India");
       
       //Zip-Code
       driver.findElement(By.id("zipcode")).sendKeys("442902");
       
       //city
       driver.findElement(By.id("city")).sendKeys("Chandrapur");
       
       //Occupation
      WebElement occupation= driver.findElement(By.id("occupation"));
      occupation.click();
      Select List=new Select(occupation);
      List.selectByValue("Selfemployed");
      
      //Hobbies
      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span")).click();
      driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")).click();
      
      //Web site
     // driver.findElement(By.id("website")).sendKeys("shirinmahajani@gmail.com");
      
      //Picture
//      String loc="D:\\SEED_INFOTECH\\Test_Case\\ScreenShot\\dropdown.jpg";
//      WebElement pic=driver.findElement(By.xpath("//*[@id=\"open\"]"));
//      pic.click();
//      pic.sendKeys("D:\\SEED_INFOTECH\\Test_Case\\ScreenShot\\dropdown.jpg");
//      pic.click();
    
      
      
      //Next
      driver.findElement(By.id("nextenterproductdata")).click();
      
      //Start Date
      driver.findElement(By.id("openstartdatecalender")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
      
      //insurance sum
      WebElement insurance= driver.findElement(By.id("insurancesum"));
      insurance.click();
      Select inList=new Select(insurance);
      inList.selectByIndex(1);
      
      //Merit rating
      WebElement merit= driver.findElement(By.id("meritrating"));
      merit.click();
      Select meList=new Select(merit);
      meList.selectByValue("Bonus 2");
      
      //Damage insurance
      WebElement damage= driver.findElement(By.id("damageinsurance"));
      damage.click();
      Select daInsu=new Select(damage);
      daInsu.selectByIndex(2);
      
      //Optional Product

     // driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
      driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
      
      //courtesy car
      WebElement courtesy= driver.findElement(By.id("courtesycar"));
      courtesy.click();
      Select court=new Select(courtesy);
      court.selectByValue("No");
      
      //next
      driver.findElement(By.id("nextselectpriceoption")).click();

      
      
      //Expected&Actual
     String expPrice="801.00",actPrice=null,expClaim="Submit",actClaim = null,expDisc="2",actDisc = null,expCover="Limited",actCover = null;
	
      
      List<WebElement>actPriceE=driver.findElements(By.xpath("//*[@id=\"selectgold_price\"]"));
     actPrice=actPriceE.get(0).getText();
     System.out.println(actPrice);
     
    WebElement actClaimE=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]"));
    actClaim=actClaimE.getText();
    System.out.println(actClaim);
     
     WebElement actDiscE=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]"));
     actDisc=actDiscE.getText();
     System.out.println(actDisc);
     
    WebElement actCoverE=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]"));
      actCover=actCoverE.getText();
      System.out.println(actCover);
      
      if((expPrice.equals(actPrice))&&(expClaim.equals(actClaim))&&(expDisc.equals(actDisc))&&(expCover.equals(actCover)))
    		  {
    	      WebElement cli= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]"));
    		 cli.click();
    		 }
      else
      {
    	  System.out.println("Data didn't match");
      }
      
      
      
      
      
      
      //Next
      driver.findElement(By.id("nextsendquote")).click();
      
      //Personal Information
      //Email
      driver.findElement(By.id("email")).sendKeys("pallavimathane03@gmail.com");
      
      //phone
      driver.findElement(By.id("phone")).sendKeys("8975496347");
      
      //Username
      driver.findElement(By.id("username")).sendKeys("PallaviM");
      
      //password
      driver.findElement(By.id("password")).sendKeys("Pallavi123");
      
     // confirmpassword
      driver.findElement(By.id("confirmpassword")).sendKeys("Pallavi123");
      
      //sendemail
      driver.findElement(By.id("sendemail")).click();
      Thread.sleep(15000);
      File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("D:\\SEED_INFOTECH\\Test_Case\\ScreenShot\\Truck.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
