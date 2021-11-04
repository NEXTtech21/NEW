package Practice;

public class PracticeChild extends PracticeParent{

	public static void main(String[] args) {
		
		PracticeChild inherit=new PracticeChild();
		//inherit.a=15;
		System.out.println(inherit.a);
		inherit.method1(20, 7, 0);
		inherit.method2();
	}

}
