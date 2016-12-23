package webapp.util;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {

	private final static ObjectMapper objectMapper = new ObjectMapper();

	private JSONUtils() {

	}

	public static ObjectMapper getObjectMapper() {

		return objectMapper;
	}

	/**
	 * json string convert to javaBean
	 */
	public static <T> T json2pojo(String jsonStr, Class<T> clazz) throws Exception {
		return objectMapper.readValue(jsonStr, clazz);
	}

	/**
	 * json string convert to javaBean
	 */
	public static <T> T json2pojo(JsonNode jsonNode, Class<T> clazz) throws Exception {
		return objectMapper.readValue(jsonNode.traverse(), clazz);
	}

	/**
	 * json string convert to map
	 */
	public static <K, V> Map<K, V> json2map(String jsonStr, Class<K> k, Class<V> v) throws Exception {
		return objectMapper.readValue(jsonStr, new TypeReference<Map<K, V>>() {
		});
	}

	/**
	 * json string convert to map
	 */
	public static <K, V> Map<K, V> json2map(JsonNode jsonNode, Class<K> k, Class<V> v) throws Exception {
		return objectMapper.readValue(jsonNode.traverse(), new TypeReference<Map<K, V>>() {
		});
	}

	/**
	 * json string convert to map with javaBean
	 */
	public static <T> Map<String, T> json2map(String jsonStr, Class<T> clazz) throws Exception {
		return json2map(jsonStr, String.class, clazz);
	}

	/**
	 * json string convert to map with javaBean
	 */
	public static <T> Map<String, T> json2map(JsonNode jsonNode, Class<T> clazz) throws Exception {
		return json2map(jsonNode, String.class, clazz);
	}

	/**
	 * json array string convert to list with javaBean
	 */
	public static <T> List<T> json2list(String jsonArray, Class<T> clazz) throws Exception {
		return objectMapper.readValue(jsonArray, new TypeReference<List<T>>() {
		});
	}

	/**
	 * json array string convert to list with javaBean
	 */
	public static <T> List<T> json2list(JsonNode jsonNode, Class<T> clazz) throws Exception {
		return objectMapper.readValue(jsonNode.traverse(), new TypeReference<List<T>>() {
		});
	}

}