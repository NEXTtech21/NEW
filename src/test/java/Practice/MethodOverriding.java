package Practice;

public class MethodOverriding extends MethodOverLoading {

	
    public void Login(String Email, String PW) {
		
	}
    public void Login(int Email, String PW) {
		
	}
	public void Login(String Email, int PW) {
		
	}
	public static void main(String[] args) {
		
		MethodOverriding obj= new MethodOverriding();
		//obj.Login("123@yahoo.com","abca23");
			obj.method1();
	}
    
}
