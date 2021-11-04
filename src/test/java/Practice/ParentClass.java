package Practice;

public class ParentClass {

	public void method1(int a,int b) {
		int sum= a+b;
		System.out.println(sum);
		}
	
	public void method2(int s, double p)
   {
		double sub= s-p;
	System.out.println(sub);	
	
   }
	
	public void FBLogin(String Email, int PW) {
		String P=Email+PW;
		System.out.println(P);
		
	}
	//soft code
	public void method(int r,int f) {
		int mud=r*f;
		
		System.out.println(mud);
	}
	
	// hard
	public void method4() {
		int o=10;
		int b=20;
		int sum = o+b;
		System.out.println("my sum is " + sum);
		
	}
}
