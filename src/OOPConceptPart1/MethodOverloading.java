package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		 int i = obj.sum(10,20);
		System.out.println(i);
		
		int j = obj.sub(50,40);
		System.out.println(j);
		
		int l = obj.division(200,50 );
	    System.out.println(l);
		
		int p = obj.mul(40,60);
	    System.out.println(p);
		
		int t = obj.percentage(78,49 );
		System.out.println(t);
		
		int x = obj.square(44);
		System.out.println(x);

	}
	
	public int sum(int a, int b) {
	int c = a+b;
	return c;
	}
	
	public int sub(int d, int e) {
		int f = d-e;
		return f;
	}
	
	public int division(int g,int h) {
		int k = g/h;
		return k;
	}
	
	public int mul(int m, int n) {
		int o = m*n;
		return o;
	}
	
	public int percentage( int q, int r) {
		int s = q*100/r;
		return s;
	}
	
	public int square(int number) {
		int w = number *number;
		return w;
	}
	
	
}
	
	
	


