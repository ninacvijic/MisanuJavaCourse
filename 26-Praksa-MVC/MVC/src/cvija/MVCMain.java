package cvija;

public class MVCMain {
	
	/*
	 * MVC arhitektura
	 * 
	 * Model-View-Controller (MVC) je dobro poznati dizajn patern u polju web razvoja. To je način da organizujemo naš kod.
	 * Navodi da se program ili aplikacija sastoji od modela podataka, informacija o prezentaciji i kontrolnih informacija.
	 * U MVC paternu treba da sve ove komponente budu odvojene kao različiti objekti.
	 * 
	 * Arhitektura MVC paterna sastoji se od tri sloja:
	 * Model: Predstavlja poslovni sloj aplikacije. To je objekt za nošenje podataka koji također može sadržavati
	 * logiku za ažuriranje kontrolera ako se podaci promene.
	 * View(Pogled/Prikaz): Predstavlja prezentacijski sloj aplikacije. Koristi se za vizualizaciju podataka koje model sadrži.
	 * Controller(Kontroler): Radi i na modelu i na pogledu. Koristi se za upravljanje tokom aplikacije,
	 * tj. protokom podataka u objektu modela i za ažuriranje pogleda kad god se podaci promene.
	 * 
	 * Zahtevi korisnika se obrađuju na sledeći način:
	 * 1.Klijent (pretraživač) šalje zahtev kontroleru na strani servera, za stranicu.
	 * 2.Kontroler tada poziva model. Prikuplja tražene podatke.
	 * 3.Zatim kontroler prenosi dohvaćene podatke u sloj prikaza(view).
	 * 4.Sada se rezultat šalje nazad pretraživaču (klijentu) od strane pogleda(view-a).
	 * 
	 * Prednosti MVC arhitekture: 
	 * MVC ima karakteristiku skalabilnosti koja zauzvrat pomaže u razvoju aplikacije.
	 * Komponente se lako održavaju jer postoji manje ovisnosti.
	 * Model se može ponovo koristiti od strane višestrukih pogleda koji omogućavaju ponovnu upotrebu koda.
	 * Programeri mogu istovremeno raditi sa tri sloja (Model, View i Controller).
	 * Koristeći MVC, aplikacija postaje razumljivija.
	 * Koristeći MVC, svaki sloj se održava zasebno, stoga ne moramo raditi s masivnim kodom.
	 * Proširivanje i testiranje aplikacije je lakše.
	 */

	public static void main(String[] args) {

		Employee model = retriveEmployeeFromDatabase();  // dohvatanje zapisa zaposlenika na osnovu employee_id iz baze podataka

		EmployeeView view = new EmployeeView();  // kreiranje view-a za pisanje detalja o zaposlenima na konzoli

		EmployeeController controller = new EmployeeController(model, view);

		controller.updateView();

		// update(ažuriranje) podataka modela
		controller.setEmployeeName("Nirnay");
		System.out.println("\nEmployee Details after updating: ");

		controller.updateView();
	}

	private static Employee retriveEmployeeFromDatabase() {
		Employee Employee = new Employee();
		Employee.setName("Anu");
		Employee.setId("11");
		Employee.setDepartment("Salesforce");
		return Employee;
	}
}

		


