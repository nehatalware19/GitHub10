package OppPart02;

public class sweechcase1 {

	public static void main(String[] args) {
		
		int month =5;
		switch( month) {  // switch case in java is executes one statement from multiple ones.
		
		case 1:
			System.out.println("jan");
			break;
			
		case 2:
			System.out.println("feb");
			break;
			
		case 3:
			System.out.println("march");
			break;
			
		case 4:
			System.out.println("april");
			break;
			
		default :  // The default keyword specifies some code to run it there is no case match
		System.out.println("may");
		
			
		}
	}

}
