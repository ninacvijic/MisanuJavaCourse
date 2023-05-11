package cvija;

public class EmployeeController { // klasa koja predstavlja kontrolera(controller)

	private Employee model;  // deklarisanje varijabli model i view
	private EmployeeView view;

	public EmployeeController(Employee model, EmployeeView view) {  // konstruktor za inicijalizaciju
		this.model = model;
		this.view = view;
	}

	public void setEmployeeName(String name) {  // getter i setter metode
		model.setName(name);
	}

	public String getEmployeeName() {
		return model.getName();
	}

	public void setEmployeeId(String id) {
		model.setId(id);
	}

	public String getEmployeeId() {
		return model.getId();
	}

	public void setEmployeeDepartment(String Department) {
		model.setDepartment(Department);
	}

	public String getEmployeeDepartment() {
		return model.getDepartment();
	}

	public void updateView() {  // metod za update pogleda(view-a)
		view.printEmployeeDetails(model.getName(), model.getId(), model.getDepartment());
	}

}
