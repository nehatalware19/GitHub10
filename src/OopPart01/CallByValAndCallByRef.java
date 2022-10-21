package OopPart01;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20; 
		obj.testSum(x,y);	
		obj.p = 40;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
					
	}
	
	public int testSum(int a, int b) {
		a = 70;
		b = 100;
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCallByRef t) {
		int temp; 
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
