package OopPart01;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);

	}
	
	public static void main(int p) {
		
	}
	public static void main(int q, int h) {
		
	}
	
	//we can overload main method also .
	//you can not creat a method  inside a method
	// duplicate method ---i.e some method name with same number of argument are not allowed
	
	//method overloading --->when the method name is same with different arguments or inpute parameater within the same class
	
	public void sum() {//0 inpute param
		System.out.println("SUM method--zero param");
	}
	
	public void sum(int i ) {//1 inpute param
		System.out.println("sum method----1 inpute param");
		
	}
	public void sum(int k, int i) { //2 inpute param
		System.out.println("sum method---- 2 inpute");
		
	}

}
