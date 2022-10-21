package Inheritance;

public class Two extends One {
	
	public void show()
	{
		System.out.println("class second: show method");
	}
	
	public void  display()
	{
		System.out.println("class second: display method");
	}

	public void main(String[] args) {


		One Ref = new One();
		Ref = new Two ();
		Ref.display();
	
	}

	
	}


