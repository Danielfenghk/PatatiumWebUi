import cucumber.api.CucumberOptions;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

/**
 * Created by wu on 2017/8/30.
 */
@CucumberOptions(strict = true,monochrome = true,features = "src/test/resources/features",glue = "")
public class DemoTest extends TestBaseCase{



}
