
public class Methodoverloading {
	public static void main(String[] args) {
		login("Josephdavidmod@gmail.com", "@it$ me ");
		login(9908529391l, "@josephdavidmod.it's me");
	}

	public static void login(String email, String password) {
		System.out.println("Email:" + email);
		System.out.println("password:" + password);
	}

	public static void login(Long mobilenumber, String password) {
		System.out.println("mobileNumber:" + mobilenumber);
		System.out.println("password:" + password);
	}
}
