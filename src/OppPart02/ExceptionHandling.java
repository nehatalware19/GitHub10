package OppPart02;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		SwitchCase sw = new SwitchCase();
		
		try {
			int a = 10;
			int b = 999;
			try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
			String s =  "abc";
			int i = Integer.parseInt(s)	;	
			System.out.println("Error Occured");
		}catch(NumberFormatException t) {
		//e.printStackTrace();
			System.out.println("Exception handled");
			
			
			}catch(ArithmeticException p) {
			
				
		}
		       catch(Exception t) {
		    	   
		       }
		finally {
			
			
			
		}
		
		
		
	}
		
		
		
	}
	
	
	
	

		
		
		
		
	
	
	







			
			
			
		
			
			
	
		

	


