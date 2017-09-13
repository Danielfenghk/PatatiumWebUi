package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.webdriver.patatiumwebui.action.BranchLoginAction;
import org.webdriver.patatiumwebui.utils.Assertion;
import org.webdriver.patatiumwebui.utils.ElementAction;


/**
 * Created by wu on 2017/8/30.
 */
public class StepTest {
    BranchLoginAction branchLoginAction=new BranchLoginAction();

    String success = "";
    ElementAction action=new ElementAction();

    @Given("^打开网页:(\\S*),输入账号:(\\S*),输入密码:(\\S*)$")
    public void login(String url,String username,String password) throws Exception{
        branchLoginAction.login(username,password,url);
    }
    @Then("^find element homepage$")
    public void assertStep(){
        action.sleep(5);
        Assertion.VerityTextPresent("首页");
        Assertion.VerityError();
    }





}
