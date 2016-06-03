package webapp.web;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:applicationContext-mvc.xml", "classpath*:applicationContext.xml","classpath*:applicationContext-security.xml"})
public class BaseControllerTest {

}
