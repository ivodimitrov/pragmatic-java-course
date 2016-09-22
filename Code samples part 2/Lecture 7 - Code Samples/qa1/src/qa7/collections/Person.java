package qa7.collections;

public class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		
		Person other = (Person) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null && other.name != null) {
			return false;
		} else if (!name.equals(other.name)) {
			return false;
		}
		
		return true;
	}
}