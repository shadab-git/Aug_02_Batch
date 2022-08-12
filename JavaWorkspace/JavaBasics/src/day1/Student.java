package day1;




/*
 *  pkg statement
 * import statements
 * class declaration
 * variables/fields
 * constructors
 * methods
 * comments can be given anywhere
 *
 * Naming conventions
 * Class/Interface - UpperCamelCase
 * variables/methods - lowerCamelCase
 * packages - lowercase
 * constants - UPPERCASE
 * 
* Name of the class/interface file should start with alphabets/_/$
* - No restriction on length
* - Give meaningful names for classes, interfaces, variables 
*   & methods
* - Give the appropriate comments where ever required
* - Don't use keywords as method/class/varible/interface names
*   static, public, final, return, super....
*   
*   Data types
*   primitive & non primitive data types
*   
*   primitive -
*     byte(0), short(0), int(0), long(0), float(0.0), double(0.0), char(\u0000), boolean(false)
*   non primitive -
*      String(null), array(null) ...
*      
*   access modifiers -
*     public - can be access from any package
*     private - within the class
*     default - within the class & within the same package
*     protected - from the child classes
*     
*   variables -
*     static variables (static) - inside class & outside methods
*     non static variables - inside class & outside methods
*     local variables - inside methods 
*     
*  ** from static area - we can access  static members directly without creating obj
*                      - non static members can be access with the help of obj ref
*                      
*  ** from non static area - we can access both static and non-static members without creating object
*/
// single line comments
/* multi
 * line
 * comments
 */


public class Student {
	
	// variables
	int rollNo;
	public String name;
	public String email;
	private String contactNo;
	private static String collegeName="ACB College";
	
	// constructors
	//-default/ no arg constructor
	Student(){} ;
		
	// Parameterized constructor
	Student(String name) {
		this.name=name;
	}
	
	Student(int rNo, String name) {
		this.rollNo=rNo;
		this.name=name;
	}
	
	Student(int rNo, String name, String email) {
		this.rollNo=rNo;
		this.name=name;
		this.email=email;
	}
	
	public Student(int rNo, String name, String email, String contactNo) {
		this.rollNo=rNo;
		this.name=name;
		this.email=email;
		this.contactNo=contactNo;
	}
	

	public static void main(String[] args) {
		// code
		int z= 100;
		// create objects
		Student std1 = new Student(1001, "Ram", "ram@gmail.com", "9999911111" );
		Student std2 = new Student(1002, "Sam", "sam@gmail.com", "9999911112" );
		Student std3 = new Student(1003, "Ravi", "ravi@gmail.com", "9999911113" );
		Student std4 = new Student();
		
		//read
		System.out.println(std1);
		System.out.println(std1.name);
		System.out.println(std3.email);
		System.out.println(std3.contactNo);
		System.out.println(std1.collegeName);
		System.out.println(std2.collegeName);
		System.out.println(Student.collegeName);
		System.out.println(collegeName);
		
		System.out.println(std4.rollNo);
		System.out.println(std4.name);
		
		//System.out.println(x);
		
	}
	
	// methods
	void m1() {
		//code 
		int x=10;
		System.out.println(x);
		System.out.println(contactNo);
		System.out.println(collegeName);
	}
	
	// blocks
	// non-static blocks
	{ 
		// code
	}
	// static blocks
	static {
		//code
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "name: " + name;
	}
	
	
	

}
