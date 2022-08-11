package day1;

public class Test {

	public static void main(String[] args) {
		// code
		// create objects
		Student std1 = new Student(1001, "Ram", "ram@gmail.com", "9999911111");
		Student std2 = new Student(1002, "Sam", "sam@gmail.com", "9999911112");
		Student std3 = new Student(1003, "Ravi", "ravi@gmail.com", "9999911113");

		// read
		System.out.println(std1);
		System.out.println(std1.name);
		System.out.println(std3.email);
		//System.out.println(std3.contactNo); // private variable
	}
}
