package org.employee;

//  class
public class EmployeeDetails {
	//           method 1
	private void empName() {
		
		System.out.println("Employee name is : Anand");
	}
	//           method 2
	private void empMob() {
		
		System.out.println("8939278863");
	}
	
	//      main method
	public static void main(String[] args) {
		
		//   object creation
		EmployeeDetails e = new EmployeeDetails();
		
		// mehtod call
		e.empName();
		e.empMob();
		
	}

}
