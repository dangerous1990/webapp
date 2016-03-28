package webapp.cxf.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext-cxf.xml");
        ProductService ps = (ProductService) context.getBean("productService");
        Product pro = new Product();
        pro.setName("test");
        pro.setPrice(10);
        pro.setType("test");
        ps.call(pro);
    }
}
