import org.dom4j.DocumentException;
import org.webdriver.patatiumwebui.config.Config;
import org.webdriver.patatiumwebui.utils.TestReport;

/**
 * Created by wu on 2017/8/29.
 */
public class TestApiMethods {
    public static void main(String[] args) {
        TestReport r=new TestReport();
        String reportUrl=null;//完整报表URL
        String logUrl=null;//日志url
        String Recipients=null; //邮件收件人地址
        try {
            reportUrl=r.getTestngParametersValue(Config.path, "reportUrl");
            logUrl=r.getTestngParametersValue(Config.path, "logUrl");
            Recipients=r.getTestngParametersValue(Config.path, "recipients");
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        System.out.println("报表URL"+reportUrl);
        System.out.println("日志URL"+logUrl);
        System.out.println("收件人地址"+Recipients);
    }
}
