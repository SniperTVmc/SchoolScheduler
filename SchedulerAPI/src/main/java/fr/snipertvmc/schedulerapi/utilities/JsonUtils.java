package fr.snipertvmc.schedulerapi.utilities;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import fr.snipertvmc.schedulerapi.SchedulerAPI;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Map;

public class JsonUtils {


	// -------------------------------------------------- //


	private static final Gson gson = new Gson();


	// -------------------------------------------------- //


	public static String mapToJson(Map<String, Object> map) {
		return gson.toJson(map);
	}


	public static Map<String, Object> jsonToMap(String json) {

		try {
			Type type = new TypeToken<Map<String, Object>>() {}.getType();
			return gson.fromJson(json, type);

		} catch (JsonSyntaxException exception) {
			throw new RuntimeException(exception);
		}
	}


	// -------------------------------------------------- //


	public static Map<String, Object> loadJson(String filePath) {

		try (InputStream inputStream = SchedulerAPI.class.getResourceAsStream("/" + filePath)) {
			if (inputStream == null) {
				throw new IOException("File not found: " + filePath);
			}

			InputStreamReader reader = new InputStreamReader(inputStream);
			Type type = new TypeToken<Map<String, Object>>() {}.getType();
			return gson.fromJson(reader, type);

		} catch (IOException exception) {
			throw new RuntimeException("Error loading JSON file", exception);
		}
	}


	// -------------------------------------------------- //
}
