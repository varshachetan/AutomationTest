package common_utilities;

import java.io.File;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ReportConfig {

    
    public static ExtentReports report;
    public static ExtentTest logger;  
       
       static Calendar cal = Calendar.getInstance();
       static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
public static String projectDirectory = System.getProperty("user.dir");
public static String ReportLocation=projectDirectory+"\\Utilities\\Report\\CreateOrder"+ sdf.format(cal.getTime())+".html";
    
public static void intialiseconfig()
{
    report=new ExtentReports(ReportLocation, true);
    logger=report.startTest("CreateOrder");    

}



public static String captureScreenShot(WebDriver driver,String screenshotname)
{
    try{
        TakesScreenshot ts=(TakesScreenshot) driver; 
        File src=ts.getScreenshotAs(OutputType.FILE);
        String des=projectDirectory+"\\Utilities\\Report\\Screenshots\\"+screenshotname+".png";
        File destination =new File(des);
        FileUtils.copyFile(src, destination);
        return des;        
    }
    catch(Exception e)
    {
        System.out.println("Exception while taking screen shot"+e.getMessage());
        return e.getMessage();
    }
    
}

public static void PassCase (String ImgDesc,String imagename )
{
    String screenshot_path=ReportConfig.captureScreenShot(DriverConfig.driver, imagename);
    String image= logger.addScreenCapture(screenshot_path);
    ReportConfig.logger.log(LogStatus.PASS, ImgDesc, image);
}

public static void FailCase (String failedDetail,String imagename )
{
    String screenshot_path=ReportConfig.captureScreenShot(DriverConfig.driver, imagename);
    String image= logger.addScreenCapture(screenshot_path);
    ReportConfig.logger.log(LogStatus.FAIL, failedDetail, image);
}
    
}
