package features;

import cucumber.api.java.en.Given;
import org.webdriver.patatiumwebui.action.PolicePageAction;

/**
 * Created by wu on 2017/9/6.
 */
public class PoliceRegisterStep {
    PolicePageAction policePageAction=new PolicePageAction();
    @Given("^非机动车登记,设备ID:(\\S*),电话:(\\S*),车架编号:(\\S*),电机编号:(\\S*)$")
    public void addCarStep(String id,String photoNumber,String cjbh,String djbh) throws Exception{
        policePageAction.addCarInformation(id,photoNumber,cjbh,djbh);
    }

}
