package org.webdriver.patatiumwebui.action;

import org.webdriver.patatiumwebui.pageObject.BranchLoginPage;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

/**
 * Created by wu on 2017/8/29.
 */
public class BranchLoginAction extends TestBaseCase {
    public BranchLoginPage branchLoginPage = new BranchLoginPage();
    ElementAction action = new ElementAction();

    public void login(String username,String password,String url) throws Exception {
        branchLoginPage.open(url);
        action.type(branchLoginPage.in_username(), username);
        action.type(branchLoginPage.in_password(), password);
        action.click(branchLoginPage.btn_submit());
    }
}
