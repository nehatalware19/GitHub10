
public class StarPatterCoding {

	public static void main(String[] args) {
		
		
		for(int i = 0; i<=4; i++) {
			
			for(int j = 0; j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for(int k = 1; k<=4; k++) {
			for(int l = 3; l>=k; l--) {
				System.out.print(" ");
			}
			for(int m= 1; m<=k; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
