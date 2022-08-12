package day1;

public class Employee {

	long empId;
	String empName;
	String deptName;
	
	// Getters & Setters
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empId=1001;
		emp1.empName="Ram";
		emp1.deptName="IT";
		
		Employee emp2 = new Employee();
		emp2.empId=1002;
		emp2.empName="Sam";
		emp2.deptName="Admin";
		
		Employee emp3 = new Employee();
		emp3.setEmpId(1003);
		emp3.setEmpName("Ravi");
		emp3.setDeptName("HR");
		
		
		
		System.out.println(emp1);// day1.Employee@75a1cd57
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(emp3.getDeptName());
		System.out.println(emp2.getEmpName());
		
		emp1.m1();
	}

	void m1() {
		System.out.println("m1 method");
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}
	

}
