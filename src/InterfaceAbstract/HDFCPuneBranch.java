package InterfaceAbstract;

public class HDFCPuneBranch implements HDFCHeadOffice {
	int j = 50;
	static int c = 20;
	int h = 60;
	static final int b = 80;

	public static void main(String[] args) {
		
		HDFCPuneBranch obj = new HDFCPuneBranch();
		
		obj.Cashier();
		
	}

	public void Cashier() {
		System.out.println("I am the cashier of Pune Branch");
		System.out.println(c);
		j = 750;
		c = 55;
		h = 80;
		System.out.println(c);
		System.out.println(j);
		System.out.println(h);
	
		
	}
	public void Manager() {
		
		
		
		
	}
	public void SO() {
	
		
	}


	public void cleark() {

		
	}

}
