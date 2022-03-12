//1st program
public class IfElse {
	public static void main(String[] args) {
		int x=0;
		if(x==0) //only boolean type allowed  true or false
		{
			System.out.println("Good morning");
		}
		else
		{
			System.out.println("Good Evening");
		}
		
		
//2nd program		
		System.out.println("\n 2nd program");
		if(x==1) //only boolean type allowed  true or false
		{
			System.out.println("Good morning");
		}
		else
		{
			System.out.println("Good Evening");
		}
		
//3rd program
		
		System.out.println("\n 3rd program");
		boolean b=true;
		if(b=false) //we assigned false value
		{
			System.out.println("Good morning");
		}
		else
		{
			System.out.println("Good Evening");
		}
		
		
//4th program
		
		System.out.println("\n 4th program");		
		
		if(true)   //if we skipping curly braces then we just run one statement other statment are not considered as if part
			System.out.println("Good");
		//else is optional it is not mandatory
		
		
//5th program
		System.out.println("\n 5th program");	
		
		if(true)
			if(true)
				System.out.println("Good");
			else
				System.out.println("Good noon");
		
	}

}
