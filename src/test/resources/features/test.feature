Feature: 设备录入
  @TestngScenario
    Scenario: 用户登录
      Given 打开网页:http://114.55.41.252:8888/ddc_branch/manage/login/page,输入账号:yytest,输入密码:123456
      Then find element homepage
      Given the equipment information,id:011002279
      Then 进行截图
      Then 等待8秒
      Then 查找设备id:011002279
      Then 进行截图
      Then 等待5秒

Feature: