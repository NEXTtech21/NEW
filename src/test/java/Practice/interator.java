package Practice;

import java.util.ArrayList;
import java.util.Iterator;



public class interator {

	public static void main(String[] args) {
		
		ArrayList<String>Cars= new ArrayList<>();
		
		Cars.add("Mazda");
		Cars.add("KIA");
		Cars.add("Lamborghini");
		Cars.add("Porsche");
		
		Iterator<String>it= Cars.iterator();
		if(it.hasNext()) {
			System.out.println(it.hasNext());
		}
		
	}

}
