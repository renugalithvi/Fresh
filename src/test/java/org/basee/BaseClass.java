package org.basee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Alert alert;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void launchedge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
public static void launchff() {

	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
}
	

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void toTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void toCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void toQuit() {
		driver.quit();

	}

	public static void toClick(WebElement element) {
		element.click();

	}

	public static void toPerformMoveToElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toPerformDoubleClick(WebElement element) {
		a.doubleClick(element).perform();

	}

	public static void toPerformKeyDown(WebElement element, String text) {
		a.keyDown(Keys.SHIFT).sendKeys(element, text).keyUp(Keys.SHIFT).perform();

	}

	public static void toPerformKeyUp(WebElement element) {
		a.keyUp(Keys.SHIFT).perform();

	}

	public static void toPerformContextClick(WebElement element) {
		a.contextClick(element).perform();

	}

	public static void toPerformEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toPerformTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toPerformCut() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void toPerformCopy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void toPerformPaste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void toJScrollDown(WebElement element) {
		JavascriptExecutor
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void toJScrollUp(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void toJFill(WebElement element, String text) {

		js.executeScript("arguments[0].setAttribute(value,text)", element);

	}

	public static void toGetJatt(WebElement element, String text) {

		js.executeScript("arguments[0].setAttribute('value',text)", element);
		Object es = js.executeScript("return arguments[0].getAttribute('value')", element);
		String s = (String) es;
	System.out.println(s);	;
	}

	public static void toJScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
public static String toGetText(WebElement element)
		
		 {
	String tex1 = element.getText();
	return tex1;
	


}
public static  String toGetAttribute(WebElement element) {
	String attribute = element.getAttribute("value");
	return attribute;

	

}
public static void alertAccept() {
	 alert = driver.switchTo().alert();
	alert.accept();

}
public static void alertDissmiss() {
	alert.dismiss();
	

}
public static void alertSendKeys(String text) {
	alert.sendKeys(text);

}
public static void AlertgetText() {
alert.getText();

}

	public static String excelRead(int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\A R\\eclipse-workspace1\\Mavenl\\Excel\\email.xlsx");

		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);

		Sheet sh = book.getSheet("Sheet1");

		
		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String value = "";

		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sdm = new SimpleDateFormat("dd-mm-yy");
			value = sdm.format(d);
		} else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);
		}
		return value;

	}

	public static void toExcelIterate(String path) throws IOException {
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		// Row r = sh.getRow(5);
		// Cell cell = r.getCell(0);
		// System.out.println(cell);
		// Row row = sh.getRow(getPhysicalNumberOfRow);

		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);

			}
		}

	}
	public static void toimplicitWait(int sec) {
driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
System.out.println("retww");
	}
	

}
