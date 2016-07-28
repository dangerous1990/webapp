package webapp;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * spring 单元测试基类
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { 
        "classpath*:applicationContext-property.xml",
        "classpath*:applicationContext-redis.xml"
        })
public class BaseTest extends AbstractJUnit4SpringContextTests {
    
    
    protected Logger Logger = LoggerFactory.getLogger(getClass());
}
