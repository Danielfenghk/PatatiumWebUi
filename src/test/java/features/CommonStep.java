package features;

import cucumber.api.java.en.Then;
import org.webdriver.patatiumwebui.utils.ElementAction;

import java.util.Date;

/**
 * Created by wu on 2017/9/1.
 */
public class CommonStep {

    ElementAction action = new ElementAction();

    @Then("^进行截图$")
    public void takeShot() throws Exception{
        String d=action.formatDate(new Date())+".jpg";

        action.Snapshot("E:\\photo\\",d);
    }

    @Then("^等待(\\S*)秒$")
    public void wait(int m) {
        action.sleep(m);
    }

}
