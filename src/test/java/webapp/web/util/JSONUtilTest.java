package webapp.web.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import webapp.model.User;
import webapp.util.JSONUtils;

public class JSONUtilTest {
	@Test
	public void json2Map() {

		User user = new User();
		user.setName("name");
		user.setPassword("password");
		Map<String, User> map = new HashMap<String, User>();
		map.put("test", user);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(map);
			System.out.println(json);
			Map<String, User> result = JSONUtils.json2map(json, String.class, User.class);
			System.out.println(result);
		} catch (JsonProcessingException e) {
		} catch (Exception e) {
		}
	}
}
