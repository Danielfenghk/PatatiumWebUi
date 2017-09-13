Feature: 设备录入
  @TestngScenario
  Scenario: 用户登录
    Given 打开网页:http://114.55.41.252:8888/ddc/manage/login/page,输入账号:yytest,输入密码:123456
    Then find element homepage
    Given 添加后装车辆设备号:011091679
    Then 进行截图
    Then 等待8秒
    Then 查找设备id:011091679
    Then 进行截图
    Then 等待5秒
    Given 打开网页:http://114.55.41.252:8888/ddcPolice/manage/login/page,输入账号:gahz01,输入密码:123456
    Then 等待10秒
    Given 非机动车登记,设备ID:011091679,电话:18755557777,车架编号:zdzc014,电机编号:zdzc0014
    Then 等待10秒
    Then 进入上牌车辆管理界面

