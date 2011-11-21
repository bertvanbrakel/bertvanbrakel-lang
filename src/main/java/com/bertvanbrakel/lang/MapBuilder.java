/*
 * Copyright 2011 Bert van Brakel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bertvanbrakel.lang;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder<K, V> {

	private final Map<K, V> map = new HashMap<K, V>();

	public static <K, V> MapBuilder<K, V> builder(K key, V value) {
		MapBuilder<K, V> builder = new MapBuilder<K, V>();
		builder.put(key, value);
		return builder;
	}

	public MapBuilder<K, V> put(K key, V value) {
		map.put(key, value);
		return this;
	}

	public Map<K, V> create() {
		return map;
	}
	
	public int size(){
		return map.size();
	}
}
