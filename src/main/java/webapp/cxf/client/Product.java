package webapp.cxf.client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
    
    private String type;
    
    private String name;
    
    private Integer price;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
