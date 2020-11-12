import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork3 {
    WebDriver driver;




    @BeforeMethod
    public void beforeMethod (){
        System.setProperty("webdriver.chrome.driver", "chromedriver 3");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://romanceabroad.com/");






    }


    @Test
    public void HowWeWork() {

        By LINK_WORK = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
        WebElement element = driver.findElement(LINK_WORK);
        element.click();
        String currentUrlHowWeWork = driver.getCurrentUrl();
        String howWeWorkTitle = driver.getTitle();
        System.out.println(howWeWorkTitle);
        Assert.assertEquals(howWeWorkTitle,"Real Ukrainian women for marriage: legitimate dating site Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlHowWeWork,"https://romanceabroad.com/content/view/how-it-works");

    }

    @Test
    public void PrettyWomen() {
        By LINK_WOMEN = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
        WebElement element = driver.findElement (LINK_WOMEN);
        element.click();
        String currentUrlPrettyWomen = driver.getCurrentUrl();
        String prettyWomenTitle = driver.getTitle();
        System.out.println(prettyWomenTitle);
        Assert.assertEquals(prettyWomenTitle, "Meet single Ukrainian women online: dating and marriage at Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlPrettyWomen,"https://romanceabroad.com/users/search");



    }

    @Test
    public void Photos() {
       By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']") ;
        WebElement element = driver.findElement(LINK_PHOTOS);
        element.click();
        String currentUrlPhotos = driver.getCurrentUrl();
        String photosTitle= driver.getTitle();
        System.out.println(photosTitle);
        Assert.assertEquals(photosTitle, "Ukrainian women photos: ladies pictures at Marry Ukrainian Lady");
        Assert.assertEquals(currentUrlPhotos,"https://romanceabroad.com/media/index");



    }

    @Test
    public void Gifts() {
        By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
       WebElement element = driver.findElement(LINK_GIFTS);
       element.click();
        String currentUrlGifts = driver.getCurrentUrl();
        String giftsTitle = driver.getTitle();
        System.out.println(giftsTitle);
        Assert.assertEquals(giftsTitle,"Pilot Group: Gift store - Categories");
        Assert.assertEquals(currentUrlGifts,"https://romanceabroad.com/store/category-sweets");



    }

    @Test
    public void TourToUkraine() {
        By LINK_TOUR = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
       WebElement element = driver.findElement(LINK_TOUR);
       element.click();
        String currentUrlTourToUkraine = driver.getCurrentUrl();
        String tourTitle= driver.getTitle();
        System.out.println(tourTitle);
        Assert.assertEquals(tourTitle, "Pilot Group: Gift store - Item");
        Assert.assertEquals(currentUrlTourToUkraine,"https://romanceabroad.com/store/sweets/20-tour_to_ukraine");

    }

    @Test
    public void Blog() {
        By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");
        WebElement element = driver.findElement(LINK_BLOG);
        element.click();
        String currentUrlBlog = driver.getCurrentUrl();
        Assert.assertEquals(currentUrlBlog,"https://romanceabroad.com/content/view/blog");

    }

    @Test
    public void SighIn() {
        By LINK_SIGH = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
        WebElement element = driver.findElement(LINK_SIGH);
        element.click();
     }

     @Test
    public void testRegistration (){
        By BUTTON_REGISTRATION= By.xpath("//button[@id='show-registration-block']");
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("Aika123@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Aika123@gmail.com");
        driver.findElement(By.xpath("//button[@data-action='next-page'][text()='Next']")).click();


     }
    @AfterMethod

    public void afterMethod (){
        //driver.quit();
    }
}
