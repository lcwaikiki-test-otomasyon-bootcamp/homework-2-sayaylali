package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver disardangelenDriver)
    {
        driver = disardangelenDriver;

    }
    public void CheckLogo() {

    }
    public void konutClick()
    {
        driver.findElement(By.cssSelector("[href=\"/kategori/emlak-konut\"]")).click();
    }
    public void satilikClick()
    {
        driver.findElement(By.cssSelector("#searchForm > div > div:nth-child(1) > div.categories-area.split-area > div:nth-child(2) > div > span")).click();
    }
    public void kiralikClick()
    {
        driver.findElement(By.cssSelector("[data-value=\"16622\"]")).click();
    }
    public void _typeMaxRent(String maxRent)
    {
        driver.findElement(By.cssSelector("[placeHolder=\"Max TL\"]")).sendKeys(maxRent);
    }
    public void clickSearch()
    {
        driver.findElement(By.cssSelector("a.btn.search")).click();
    }
    public void clickSaveSearch()
    {
        driver.findElement(By.cssSelector("[src=\"/assets/images/celebrity_indicate_right_top_web:4a143102619e2856355174a0c3c09525.png\"]")).click();
    }
    public void clickIlCombo()
    {
        driver.findElement(By.xpath("//*[@id=\"searchResultLeft-address\"]/dl/dd/ul/li[1]/a")).click();

    }
    public void clickcityName(String cityName)
    {
        waitBySecond(1);
        driver.findElement(By.cssSelector(".js-address-filter")).sendKeys(cityName);
        waitBySecond(3);
        driver.findElement(By.cssSelector("li[data-label="+cityName.toLowerCase(Locale.ROOT)+"] a[class='noChild single-selection']")).click();

    }
    public void clickFiltersearch()
    {
        waitBySecond(3);
        driver.findElement(By.cssSelector("[aria-label=\"Kapat\"]")).click();
        waitBySecond(3);
        driver.findElement(By.cssSelector(".btn.btn-block.search-submit")).click();

    }
    public void waitBySecond(int sec)
    {
        try
        {Thread.sleep(sec*1000);}catch (InterruptedException a){a.printStackTrace();}
    }

}
