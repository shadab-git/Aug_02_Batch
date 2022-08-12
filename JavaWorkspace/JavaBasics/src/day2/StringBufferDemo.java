package day2;

/*
 * StringBuffer
 *   - mutable
 *   - introduced in Java 1.0v
 *   - methods are synchronized - thread safe
 *   - default capacity - 16
 *   - new capacity - (oldcapacity*2)+2.
 *   - equals method is not overriden in string buffer  
 *   
 *   - StringBuilder introduced in java1.5v
 *     - methods are not synchronized 
 *     - No thread safety
 *     - faster compare to StringBuffer	  
 */   

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity()); // 16
		
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2.capacity()); //21
		
		sb2.append("asdfg ggqwe qrttt ttt");
		System.out.println(sb2.capacity()); // 44
		
		StringBuffer sb3 = new StringBuffer("Hello");
		
		System.out.println(sb2==sb3);// reference comparison-false
		System.out.println(sb2.equals(sb3));// reference comparison - false
		
		StringBuilder sbd1 = new StringBuilder();
		System.out.println(sbd1.capacity()); // 16
		
		StringBuilder sbd2 = new StringBuilder("Hello");
		System.out.println(sbd2.capacity()); //21
		
		StringBuilder sbd3 = new StringBuilder("Hello");
		
		System.out.println(sbd2==sbd3);// reference comparison-false
		System.out.println(sbd2.equals(sbd3));// reference comparison - false
		
		
		// Converting StringBuilder to String
		System.out.println(sbd2.getClass().getName());// StringBuilder
		 
		String str2 = new String(sbd2);
		String str3 = new String(sbd3);
		
		System.out.println(str2.getClass().getName());// String
		
		System.out.println(str2.equals(str3)); // content comparison - true
		
		System.out.println(str2);//"Hello"
		// converting String to StringBuffer
		StringBuffer sb4 = new StringBuffer(str2);
		sb4.reverse();
		System.out.println(sb4);
		
		
		
		
	
		

		
		
	}

}
