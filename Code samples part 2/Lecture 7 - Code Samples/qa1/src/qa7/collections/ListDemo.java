package qa7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		s.add("aaa");
		s.add("ccc");
		s.add("bbb");
		
		System.out.println(s.contains("aaa"));
		for (String el : s) {
			System.out.println(el);
		}
		
		for (String el : s) {
			if (el.equals("ccc")) {
//				s.remove("ccc");
			}
		}
		
		for (String el : s) {
			System.out.println(el);
		}
		
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
//			it.remove();
		}
		
		Collections.sort(s);
		
	}
}