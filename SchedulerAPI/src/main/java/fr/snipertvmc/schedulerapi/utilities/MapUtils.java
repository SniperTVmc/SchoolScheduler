package fr.snipertvmc.schedulerapi.utilities;

import java.util.*;

public class MapUtils {


	// ---------------------------------------- //


	public static List<?> getKeys(Map<?, ?> map) {
		Set<?> keys = map.keySet();
		return new ArrayList<>(keys);
	}


	public static List<?> getValues(Map<?, ?> map) {
		Collection<?> values = map.values();
		return new ArrayList<>(values);
	}


	public static Object getKeyWithValue(Map<?, ?> map, Object value) {
		for (Map.Entry<?, ?> entry : map.entrySet()) {
			if (entry.getValue().equals(value)) {
				return entry.getKey();
			}
		}
		return null;
	}


	// ---------------------------------------- //
}
