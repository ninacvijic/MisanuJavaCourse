package cvija;

public class Employee { // klasa koja predstavlja model

	private String EmployeeName;  // deklarisanje varijabli
	private String EmployeeId;
	private String EmployeeDepartment;

	public String getId() {  // geteri i seteri
		return EmployeeId;
	}

	public void setId(String id) {
		this.EmployeeId = id;
	}

	public String getName() {
		return EmployeeName;
	}

	public void setName(String name) {
		this.EmployeeName = name;
	}

	public String getDepartment() {
		return EmployeeDepartment;
	}

	public void setDepartment(String Department) {
		this.EmployeeDepartment = Department;
	}

}
