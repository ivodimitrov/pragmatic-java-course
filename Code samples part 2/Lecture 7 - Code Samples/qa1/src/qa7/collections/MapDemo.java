package qa7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("aa", "123");
		map.put("bb", "456");
		
		System.out.println(map.get("aa"));
	}

}