package Practice;

public class MethodOverLoading {
	
	public void method1() {
		
	}
	
	public void method1(int a, int b) {
		
		int sub=a+b;
		System.out.println(sub);
		
	}

	public void Login(String Email, String PW) {}
	
	// negative scenario
	
	public void Login(int Email, String PW) {}
	
	public void Login(String Email, int PW) {}
	
	// negative
     public void Login(int Email, double PW) {}
	
}


