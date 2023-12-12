abstract class Animals{
	void info() {
		System.out.println("animal data........");
	}
	abstract void name();
	abstract void sound();
	abstract void legs();
}

class Dogs extends Animals{

	void name() {
		System.out.println("dog name tommy");
		
	}
	void sound() {
		System.out.println("sounds bow bow");
		
	}

	void legs() {
		System.out.println("4 legs");
		
	}
	
}

class Cats extends Animals{

	void name() {
		System.out.println("cat name jerry");
		
	}
	void sound() {
		System.out.println("sounds meow");
		
	}

	void legs() {
		System.out.println("4 legs");
		
	}
	
}
public class AbstractionExample {

	public static void main(String[] args) {
		
	//	Animals a = new Animals();
		
		Animals a = new Cats();
		a.info();
		a.name();
		a.sound();
		a.legs();
		
		Animals a1 = new Dogs();
		a1.info();
		a1.name();
		a1.sound();
		a1.legs();
	}
}








