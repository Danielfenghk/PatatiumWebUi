package org.webdriver.patatiumwebui.action;

import org.webdriver.patatiumwebui.pageObject.PolicePage;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

/**
 * Created by wu on 2017/9/6.
 */
public class PolicePageAction extends TestBaseCase{
    PolicePage policePage=new PolicePage();
    public ElementAction action=new ElementAction();
    public void addCarInformation(String id,String photoNumber,String cjbh,String djbh) throws Exception{

        action.click(policePage.btn_spgl());
        action.sleep(2);
        action.click(policePage.btn_fjdc());
        action.sleep(8);
        action.type(policePage.in_hjdz(),"杭州");
        action.type(policePage.in_xm(),"王黎璃");
        action.type(policePage.in_zjhm(),"330106555588887777");
        action.type(policePage.in_lxdh(),photoNumber);
        action.type(policePage.in_sfz(),"C:\\Users\\wu\\Desktop\\photo\\sfz.jpg");
        action.type(policePage.in_cphm(),"浙A768BB");
        action.type(policePage.in_cjbh(),cjbh);
        action.type(policePage.in_djbh(),djbh);
        action.type(policePage.in_sbid(),id);
        action.type(policePage.in_gczm(),"C:\\Users\\wu\\Desktop\\photo\\sfz.jpg");
        action.type(policePage.in_clzp(),"C:\\Users\\wu\\Desktop\\photo\\sfz.jpg");
        action.takeShot();
        action.click(policePage.btn_tj());
    }


    public void carManage() {
        //action.click();
        System.out.println("开始测试");
    }
}
