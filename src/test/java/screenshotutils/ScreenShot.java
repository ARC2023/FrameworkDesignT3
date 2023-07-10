package screenshotutils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.qa.driverhandling.Driverhandler;
import hooks3.HooksT3;

public class ScreenShot extends Driverhandler{
	public static int counter = 1;

	public static void takeScreenShotOnFailure() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desFile = new 
				File("C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting3\\ScreenShotOnFailure\\" +
		HooksT3.folderName + "\\" + "Failed" + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken For Failure");
	}

	public static void takeScreenShot() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desFile = 
		new File("C:\\Users\\glend\\eclipse-workspace\\CucumberFrameworkTesting3\\ScreenShotOnSuccess\\" 
		+ HooksT3.folderName
				+ "\\" + counter + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken");
		counter++;
	}
}
