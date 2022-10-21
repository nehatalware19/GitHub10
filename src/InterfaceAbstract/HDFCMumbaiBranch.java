package InterfaceAbstract;

public class HDFCMumbaiBranch implements HDFCHeadOffice {
	
	int a = 10;
	static int b = 20;
	final int c = 30;
	static final int d = 40; 

	public static void main(String[] args) {
		
		 HDFCMumbaiBranch obj = new  HDFCMumbaiBranch();
		 
		 obj.cleark();
		 obj. SO();

	}


	public void Cashier() {
		
		
	}

	
	public void Manager() {
		
	}

	
	public void SO() {
		int a=90;
		int b=80;
		System.out.println(a);
		System.out.println(b);
		
	}

	
	public void cleark() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
