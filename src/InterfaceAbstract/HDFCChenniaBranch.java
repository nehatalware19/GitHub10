package InterfaceAbstract;

public class HDFCChenniaBranch implements HDFCHeadOffice{
	
	int z = 99;
	static int y = 88;
	final int x = 77;
	static final int w = 66;

	public static void main(String[] args) {
		
		HDFCChenniaBranch obj = new HDFCChenniaBranch();
		 
		obj.cleark();
		obj.Manager();
		

	}

	
	public void Cashier() {
		
	}
		
		
	public void Manager() {
		System.out.println(z);
		System.out.println(x);
		
		
	}

	
	public void SO() {
		
		
	}

	public void cleark() {
		int t = 44;
		System.out.println(x);
		System.out.println(w);
		System.out.println(y);
		
		
	}

}
