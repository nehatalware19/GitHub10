package OOPConceptPart1;

import java.util.*;

public class ArraList {

	public static void main(String[] args) {
		
		
		ArrayList a =new ArrayList();
		
		a.add(15);
		a.add(123);
		a.add(1597);
		a.add(743258);
		a.add(369);
		a.add(456);
		a.add(321456);
		a.add("sachin");
		a.add(0.525);
		a.add(52666666);
		a.add(9874);
		a.add(4756);
		a.add(563274512);
		a.add(1500);
		a.add(456);
		a.add(45);
		a.remove(5);
		
		
		System.out.println(a.size() );
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(8765);
		System.out.println(b.size());
	    
		
		ArrayList<String> S = new ArrayList<String>();
		
		S.add("sachin");
		
		int m = 0;
		for(int i = 0;i<a.size(); i++);{
			int p= (int) a.get(m);
			m=m+p;
			System.out.println(m);
		}
				
		

	}

}
