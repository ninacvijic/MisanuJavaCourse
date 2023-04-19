package cvija;

public class A<T, V> {  //* 2 parametra, ne mogu se isto zvati, po defaultu su nazivi T i V (moze npr umesto T pisati i TP, ali onda svugde tako da stoji)
	
	T obj1;
	V obj2;
	
	A(T o1, V o2){  // konstruktor sa 2 parametra
		obj1 = o1;  // moglo i preko this
		obj2 = o2;
	}
	
	// geteri i seteri:
	public T getObj1() {
		return obj1;
	}
	
	public void setObj1(T obj1) {
		this.obj1 = obj1;  // cisto za vezbu // ne treba nam u ovom zadatku seter
	}
	// sada pravimo za parametar V:
	public V getObj2() {
		return obj2;
	}
	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	void prikaziTip() {
		System.out.println("Tip T je: " + obj1.getClass().getName());
		System.out.println("Tip V je: " + obj2.getClass().getName());
	}

}
