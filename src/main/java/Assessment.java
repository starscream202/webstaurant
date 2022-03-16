import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Assessment {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\stars\\eclipse-workspace\\MyFirstJava\\src\\com\\syntax\\SeleniumProject\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.webstaurantstore.com/");
        driver.findElement(By.xpath("//input[contains(@id,'searchval')]")).sendKeys("stainless work table");
        driver.findElement(By.xpath("//button[contains(@value,'Search')]")).click();
        List<WebElement> searchResult = driver.findElements(By.xpath("//div[contains(@class,'ag ag-category-grid ag-wide box')]"));

        for (WebElement link : searchResult) {
            String linkText = link.getText();
            if (linkText.contains("Table")) {
                System.out.println("All search results have Table in title");
                continue;
            }

        }
        driver.findElement(By.xpath("(//a[contains(text(),'9')])[10]")).click();
        driver.findElement(By.xpath("(//a[contains(@href,'adva')])[56]")).click();
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Em')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'E')]")).click();
        driver.close();
    }
}
