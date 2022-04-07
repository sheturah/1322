package payRoll;

public class Employee {
	
 private String name;
 private int employeeID;
 private static int numbOfEmployees=0;
 
 Employee()
 {
	 name = "new employee";
	 ++numbOfEmployees;
 }

public Employee(String name) {
	
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEmployeeID() {
	return employeeID;
}

public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
 
public static int getNumberOfEmployees()
{
	return numbOfEmployees;
}

public static int decreaseNumberOfEmployees()
{
	numbOfEmployees--;
	return numbOfEmployees;
	}

 
}
