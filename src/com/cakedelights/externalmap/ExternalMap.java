package com.cakedelights.externalmap;

import java.util.HashMap;
import java.util.Map;

public class ExternalMap {
	private static ExternalMap instance = null;
	private Map<String, String> logincache;

	private ExternalMap() {
		logincache=new HashMap<>();

	}

	public static ExternalMap getInstance() {
		if (instance == null) {
			instance = new ExternalMap();
		}
		return instance;
	}

	public void add(String key, String value) {
		logincache.put(key, value);

	}

	public String get(String key) {
		String username=logincache.get(key);
		return username;
	}

	public void remove(String key) {
		logincache.remove(key);
	}

	public void removeAll() {

	}

}
