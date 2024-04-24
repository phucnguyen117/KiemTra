package advance.dev;

public class Person {
	protected String name;
	protected int age;

	// Khoitao
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Get ten
	public String getName() {
		return name;
	}

	// Set ten
	public void setName(String name) {
		this.name = name;
	}

	// Get tuoi
	public int getAge() {
		return age;
	}

	// Set tuoi
	public void setAge(int age) {
		this.age = age;
	}
}
