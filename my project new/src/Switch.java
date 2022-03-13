
public class Switch {
	public static void main(String[] args)
	{
		int x=10;
		switch(x)
		{
		case 10:
			System.out.println("Good noon");
			break;
		default:
			System.out.println("Happy Womens day");
		}
		
		//2nd Example
		
		System.out.println("\n 2nd program");
		int z=10; //z is variable not a constant
		final int y=20; //y is constant because here we declared as final
		switch(z)
		{
		case 10:
			System.out.println(10);
			break;
			
		case y: //y is called as case label
			System.out.println(20);
			break;
		}
		
		//3rd program
		System.out.println("\n 3rd program");
		int w=10; //z is vaeriable not a constant
		
		switch(60)//11
		{
		case 10:
			System.out.println(101);
			break;
			//case label
		case 10+20+30: //constant
			System.out.println(20);
			break;
		}
		
		//4th Example
		
		System.out.println("\n 4th program");
		byte b=10;
		switch(b)
		{
		case 10:
			System.out.println("Happpy");
			break;
			
		case 100:
			System.out.println("womens");
			break;
		default:
			System.out.println("day");
		}
		
		//5th program 
		System.out.println("\n 5th program");
		int a=10;
		switch(a)
		{
		case 'f': 
			System.out.println("f");
			break;
			
		case 97:
			System.out.println(97);
			break;	
		}	
		
		
		//6th program
		System.out.println("\n 6th program");	
		switch(0)
		{
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			
		default:
			System.out.println("default");
		}
		
	}

}
