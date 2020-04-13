package assignment14.Question04;

public class TestPerson {

	public static void main(String[] args) {
		Person person1 = new Person();

		System.out.println(person1.getFirstName()); //"undefined"
		System.out.println(person1.getLastName()); //"undefined"
		System.out.println(person1.getAge()); // -1
		System.out.println(person1.toString()); //"undefined | undefined | -1"

		person1.setFirstName("John");
		person1.setLastName("Doe");
		person1.setAge(44);

		System.out.println(person1.toString() ); // "John | Doe | 44"

		Person person = new Person("Fatima", "Lee", 22);

		System.out.println(person.getFirstName()); //"Fatima"
		System.out.println(person.getLastName()); //"Lee"
		System.out.println(person.getAge()); // 22
		System.out.println(person.toString()); //"Fatima | Lee | 22"
	}

}
