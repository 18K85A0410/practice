public class Demo{
	public static void main(String[] args) {
	System.out.println("hi user");
	System.out.println("hello");
	int i[] = {1,2,4};
	System.out.println(i[0]);
	
	try {
	System.out.println(i[4]);
	}
/*	catch(Exception e) {
	System.out.println(e);
	}*/
	finally {
		System.out.println("exception handled");
	}
	System.out.println("bye");
	}
	 
}