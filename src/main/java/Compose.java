import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose extends Base
{
    @FindBy(xpath="//div[@class='T-I T-I-KE L3']") private WebElement ClkOnCompose;
    @FindBy(xpath="//textarea[@name='to']") private WebElement To;
    @FindBy(xpath="//input[@name='subjectbox']") private WebElement Subject;
    @FindBy(xpath="//div[@aria-label='Message Body']") private WebElement MailBody;
    //@FindBy(xpath="//*[@id=\":an\"]/div[2]") private WebElement ThreeDot;
    //@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]/div[2]") private WebElement ThreeDot;
    @FindBy(xpath="//tbody/tr/td[5]//div[@class='J-J5-Ji J-JN-M-I-JG']") private WebElement ThreeDot;
    @FindBy(xpath="(//div[@class='J-N-Jz'])[9]") private WebElement label;
    @FindBy(xpath="//div[@title='Social']") private WebElement SocialLabel;
    @FindBy(xpath="//div[@aria-label='Send ‪(Ctrl-Enter)‬']") private WebElement Send;
    @FindBy(xpath="//div[@aria-label='Social']") private WebElement social;
    @FindBy(xpath="//span[@class='aXw T-KT']") private WebElement Starred;
    @FindBy(xpath="(//span[@name='me'])[2]") private WebElement OpenTheEmail;


    Compose(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    public void ComposePage() throws InterruptedException
    {
        ClkOnCompose.click();
        To.sendKeys("suhasjoshi1856@gmail.com");
        Subject.sendKeys("Test Mail");
        MailBody.sendKeys("Test Email Body");
        ThreeDot.click();
        Thread.sleep(3000);
        label.click();
        Thread.sleep(5000);
//		Actions act = new Actions(driver);
//		act.moveToElement(SocialLabel).click().build();
        SocialLabel.click();
        Send.click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        social.click();
        Thread.sleep(4000);
        Starred.click();
        Thread.sleep(6000);
        OpenTheEmail.click();
    }



}
