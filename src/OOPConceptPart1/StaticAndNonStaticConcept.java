package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//global vars : the scope of global vars will be available across all the functions with same condition.

		String name ="Tom"; //non static global var.
		static int age = 25; //static global var.
		
		public static void main (String[] args) {
			
			//how to call static method and vars?
			//1. direct calling;
			sum();
			//2.calling by classname:
			StaticAndNonStaticConcept.sum();
			
			System.out.println(age);
			System.out.println(StaticAndNonStaticConcept.age);
			
			//how to call non static method and vars :
			
			StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
			obj.sendmail();
			System.out.println(obj.name);
			
			

	}
		public void sendmail() {//non static method
			System.out.println("sendmail");
			
		}
		public static void sum( ) { //static method
			System.out.println();
		}

}
