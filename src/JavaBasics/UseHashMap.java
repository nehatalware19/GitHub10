package JavaBasics;

import java.util.HashMap;

public class UseHashMap {

	public static void main(String[] args) {
		
		
		HashMap hasm = new HashMap();
		
		hasm.put("neha", 30);
		hasm.put("Bittu", 10);
		hasm.put("kalpna", 40);
		
		
		System.out.println(hasm.size());
		
		// HashMap does not allow duplicate key
		// HashMap allow one null key
		// HashMap allow null value


	}

}
