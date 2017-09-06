Feature: 设备录入
  @TestngScenario
  Scenario: 用户登录
    Given 打开网页:http://106.14.97.98/ddc/manage/login/page,输入账号:yytest,输入密码:123456
    Then find element homepage
    Given the equipment information,id:011002279
    Then 进行截图
    Then 等待8秒
    Then 查找设备id:011002279
    Then 进行截图
    Then 等待5秒
    Given 打开网页:http://106.14.97.98/ddcPolice/manage/login/page,输入账号:zjga01,输入密码:123456
    Then 等待10秒
    Given 非机动车登记,设备ID:011002279,电话:18755559999,车架编号:11111,电机编号:1111
    Then 等待10秒

