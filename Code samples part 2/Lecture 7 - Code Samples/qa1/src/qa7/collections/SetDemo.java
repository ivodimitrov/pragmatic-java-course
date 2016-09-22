package qa7.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("kopche");
		set.add(5);
		
		System.out.println(set.size());
		
		Set<String> names = new HashSet<String>();
		names.add("Pesho");
		names.add("Gosho");
		names.add("Ivan");
		
		System.out.println(names.size());
		names.add("Ivan");
		System.out.println(names.size());
		
		Set<Person> persons = new HashSet<Person>();
		Person p1 = new Person(33, "aa");
		Person p2 = new Person(33, "aa");
		persons.add(p1);
		persons.add(p2);
		
		System.out.println(persons.size());
	}

}