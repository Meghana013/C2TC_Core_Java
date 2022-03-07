
public class Operators {

	public static void main(String[] args) {
		// Declaring the int datatype for operation.
		int num1 = 10;
		int num2 = 4;
		int res = 0;
		
		res = num1 + num2;
		System.out.println("Addition = "+res);
		
		res = num1 - num2;
		System.out.println("Substraction = "+res);
		
		res = num1 * num2;
		System.out.println("Multiplication = "+res);
		
		res = num1 % num2;
		System.out.println("Remainder = "+res);
		
		System.out.println();
		
		int num4 = 8;
		num4++; // i.e.. num4 = num4 + 1
		System.out.println(" Inc a single value: " +num4);
		
		num4--; // i.e.. num4 = num4 - 1
		System.out.println(" Inc a single value: " +num4);
		
	}

}
