package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.webdriver.patatiumwebui.action.EquimentPageAction;

/**
 * Created by wu on 2017/8/30.
 */
public class EquipmentStepTest {
    EquimentPageAction equimentPageAction=new EquimentPageAction();
    @When("^add equipment$")
    public void equipmentAdd() throws Exception{

    }
    @Given("^the equipment information,id:(\\S*)$")
    public void giveInformationStep(String id)throws Exception{
        equimentPageAction.add(id);
    }
    @Then("^查找设备id:(\\S*)$")
    public void findEquipment(String id) throws Exception{
        equimentPageAction.findEquipmentByID(id);
    }

}
