package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver initializeDriver() {

		driver = new ChromeDriver();
		driver.get("https://o3.openmrs.org/openmrs/spa/login");

		return driver;
	}

	public static String getTitle() {
		String loginTitle = driver.getTitle();
		return loginTitle;
	}

	public static void closeDriver() {
		driver.quit();
	}

	public static void forScreenshot() throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				"C:\\Users\\Gayathri\\MyGitProjects\\Java-selenium-project_13\\OpenMRSAutomation\\src\\test\\java\\TestScreenshots");
		FileUtils.copyFile(srcFile, destFile);
	}

}
