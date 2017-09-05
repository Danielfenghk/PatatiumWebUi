package org.webdriver.patatiumwebui.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.webdriver.patatiumwebui.pageObject.EquimentPage;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.ElementAction;

/**
 * Created by wu on 2017/8/30.
 */
public class EquimentPageAction extends BaseAction {
    EquimentPage equimentPage=new EquimentPage();
    ElementAction action=new ElementAction();
    public void add(String id)throws Exception{
        action.click(equimentPage.btn_sbgl());
        action.click(equimentPage.btn_sbwh());
        action.click(equimentPage.btn_add());
        action.type(equimentPage.in_scph(),"20170831");
        action.type(equimentPage.in_sbxh(),"DB20");
        action.type(equimentPage.in_id(),id);
        action.type(equimentPage.in_sbmm(),"123456");
        action.type(equimentPage.in_wlwk(),"33010222255447");
        action.type(equimentPage.in_gjbb(),"v1.0.0");
        action.type(equimentPage.in_date(),"2017-08-30");
        action.typeKeyWord(equimentPage.in_date(),Keys.ENTER);
        action.selectByValue(equimentPage.in_sscs(),"EA80B64AFA0349928A1E1608980D4131");
        action.click(equimentPage.btn_submit());

    }

    public void findEquipmentByID(String id) throws Exception{
        action.click(equimentPage.btn_sbwh());
        action.type(equimentPage.in_search(),id);
        action.typeKeyWord(equimentPage.in_search(),Keys.ENTER);
        action.sleep(10);


    }
}
