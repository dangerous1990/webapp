package webapp.util.json;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import webapp.util.JSONUtils;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * DataObject解析
 * 
 * @author ta0273 limeng
 */
public abstract class BaseDataObjectParser<T> {
    
    protected Class<T> clazz;
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public BaseDataObjectParser() {
        
        Class clazz = getClass();
        while (clazz != Object.class) {
            Type t = clazz.getGenericSuperclass();
            if (t instanceof ParameterizedType) {
                Type[] args = ((ParameterizedType) t).getActualTypeArguments();
                if (args[0] instanceof Class) {
                    this.clazz = (Class<T>) args[0];
                    break;
                }
            }
            clazz = clazz.getSuperclass();
        }
    }
    
    /**
     * Get DataObject from JsonNode
     * 
     * @param jsonNode
     * @return
     * @throws Exception
     */
    public T getDataObject(JsonNode jsonNode) throws Exception {
        return (T) JSONUtils.json2pojo(jsonNode, clazz);
    }
    
    /**
     * Get DataObject from JsonNode
     * 
     * @param jsonStr
     * @return
     * @throws Exception
     */
    public T getDataObject(String jsonStr) throws Exception {
        return (T) JSONUtils.json2pojo(jsonStr, clazz);
    }
    
}
