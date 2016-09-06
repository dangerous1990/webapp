package webapp.redis;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import webapp.BaseTest;

public class RedisTest extends BaseTest {
    
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    
    @Test
    public void test() {
        redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set("test".getBytes(), "helloworld".getBytes());
                return null;
            }
        });
        String value = redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                try {
                    return new String(connection.get("test".getBytes()),"utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
        
        Assert.assertEquals(value, "helloworld");
    }
    @Test
    public void testGet() {
        redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set("test1".getBytes(), "helloworld".getBytes());
                return null;
            }
        });
        
        String value = redisTemplate.opsForValue().get("test1");
        
        Assert.assertEquals(value, "helloworld");
    }
    
}
