package assignment14.Question04;

public class Person {
	private String FirstName, lastName;
	private int age;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firsaName) {
		this.FirstName = firsaName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Person() {
		this.age = -1;
		this.FirstName = "undefined";
		this.lastName = "undefined";
	}

	public Person(String firstName, String lastName, int age) {
		this.FirstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "person [firstName=" + FirstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

}
