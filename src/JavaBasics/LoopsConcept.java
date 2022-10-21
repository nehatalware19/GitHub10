package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop:
		//dis-advantages of while loop: it will generate infinite loop if you do not give incremental/decremental part
		
		int i=1;//initialization
		int jj=4;
		while(i<=jj) { //conditional
			  jj++;
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		 System.out.println("***********");
		 
		 //j++ means j = j+1
		 
		 //2. for loop:
		 for(int j=1; j<=100;j++) {
			 System.out.println(j);
		 }

		 
		 //print 10 to 1
		 //10 9 8 7 6 5 4 3 2 1
		 for(int k=10;k>=1;k--) {
			 System.out.println(k);
		 }
	}

}
