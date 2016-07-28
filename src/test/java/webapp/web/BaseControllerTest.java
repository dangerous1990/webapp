package webapp.web;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:applicationContext-mvc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseControllerTest {

}
