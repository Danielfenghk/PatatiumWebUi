package org.webdriver.patatiumwebui.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.webdriver.patatiumwebui.pageObject.EquimentPage;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

/**
 * Created by wu on 2017/8/30.
 */
public class EquimentPageAction extends TestBaseCase{
    EquimentPage equimentPage=new EquimentPage();
    ElementAction action=new ElementAction();
    public void add(String id)throws Exception{
        action.click(equimentPage.btn_sbgl());
        action.sleep(2);
        action.click(equimentPage.btn_sbwh());
        action.click(equimentPage.btn_add());
        action.sleep(2);
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
    public void addAter(String id)throws Exception{
        action.click(equimentPage.btn_sbgl());
        action.sleep(2);
        action.click(equimentPage.btn_sbwh());
        action.click(equimentPage.btn_add());
        action.sleep(2);
        action.type(equimentPage.in_scph(),"20170831");
        action.type(equimentPage.in_sbxh(),"DB20");
        action.type(equimentPage.in_id(),id);
        action.type(equimentPage.in_sbmm(),"123456");
        action.type(equimentPage.in_wlwk(),"33010222255447");
        action.type(equimentPage.in_gjbb(),"v1.0.0");
        action.type(equimentPage.in_date(),"2017-08-30");
        action.typeKeyWord(equimentPage.in_date(),Keys.ENTER);
        action.selectByValue(equimentPage.in_sscs(),"B8E8B4373FAE48FB912BF0062A10B06F");
        action.selectByIndex(equimentPage.select_azlx(),1);
        action.type(equimentPage.in_glqy(),"浙江省");
        action.typeKeyWord(equimentPage.in_glqy(),Keys.ENTER);
        action.click(equimentPage.btn_submit());

    }

}
