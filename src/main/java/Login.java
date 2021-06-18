import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base
{

    @FindBy(xpath="//input[@type='email']") private WebElement EnterEmail;
    @FindBy(xpath="//span[@jsname='V67aGc']") private WebElement ClkOnNext1;
    @FindBy(xpath="//input[@name='password']") private WebElement EnterPassword;
    @FindBy(xpath="//span[text()='Next']") private WebElement ClkOnNext2 ;

    Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    public void LoginPage() throws InterruptedException {

        EnterEmail.sendKeys("suhasjoshi1856@gmail.com");
        ClkOnNext1.click();
        EnterPassword.sendKeys("Suhasjoshi1857");
        Thread.sleep(4000);
        ClkOnNext2.click();
    }

}
