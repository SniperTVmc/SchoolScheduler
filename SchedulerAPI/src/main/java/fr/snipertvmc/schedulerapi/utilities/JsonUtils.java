package fr.snipertvmc.schedulerapi.utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.snipertvmc.schedulerapi.Main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class JsonUtils {


	private static final ObjectMapper objectMapper = new ObjectMapper();


	// -------------------------------------------------- //


	public static String mapToJson(Map<String, Object> map) {
		try {
			return objectMapper.writeValueAsString(map);
		} catch (JsonProcessingException exception) {
			throw new RuntimeException(exception);
		}
	}


	public static Map<String, Object> jsonToMap(String json) {
		try {
			return objectMapper.readValue(json, new TypeReference<>(){});
		} catch (JsonProcessingException exception) {
			throw new RuntimeException(exception);
		}
	}


	// -------------------------------------------------- //


	public static Map<String, Object> loadJson(String filePath) {
		try (InputStream inputStream = Main.class.getResourceAsStream("/" + filePath)) {
			if (inputStream == null) {
				throw new IOException("File not found: " + filePath);
			}
			return objectMapper.readValue(inputStream, new TypeReference<>() {});
		} catch (IOException exception) {
			throw new RuntimeException("Error loading JSON file", exception);
		}
	}


	// -------------------------------------------------- //
}