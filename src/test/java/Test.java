import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class Test extends Base
{
    Login login;
    Compose compose;
    Verification verify;

    @BeforeClass
    public void InitialStage()
    {
        Base.OpebTheBrowser();
    }

    @BeforeMethod
    public void SetUP()
    {
        login = new Login(driver);
        compose = new Compose(driver);
        verify = new Verification(driver);
    }

    @org.testng.annotations.Test()
    public void LoginToGmail() throws InterruptedException, IOException {
        login.LoginPage();
        System.out.println("Gmail Login Activity Sucessful");
    }

    @org.testng.annotations.Test(priority=1)
    public void ComposeAnEmail() throws InterruptedException, IOException {
        compose.ComposePage();
        System.out.println("Compose Email Activity Sucessful ");
    }

    @org.testng.annotations.Test(priority = 2)
    public void VerifySubjectAndEmailBody()
    {
        verify.VerifySubject();
        verify.VerifyReceivedEmail();
    }

}
