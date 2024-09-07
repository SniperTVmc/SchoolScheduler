package fr.snipertvmc.schedulerapi.utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {


	private static ObjectMapper objectMapper = new ObjectMapper();


	// -------------------------------------------------- //


	public static String objectToJson(Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}


	public static Object jsonToObject(String json) {
		try {
			return objectMapper.readValue(json, new TypeReference<>(){});
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}


	// -------------------------------------------------- //
}