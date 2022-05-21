package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	static WebDriver driver;
public static void takeScreenshot(String fileName) throws IOException {
	TakesScreenshot file = ((TakesScreenshot)driver);
	File src=file.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\"+fileName+".png"));
}
}