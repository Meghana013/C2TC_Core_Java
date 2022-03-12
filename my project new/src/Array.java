
public class Array {

	public static void main (String[] args) {
		int [] arr=new int[3];
		System.out.println(arr.getClass().getName());
		
		boolean [] ar=new boolean[3];
		System.out.println(ar.getClass().getName());

		byte [] array=new byte[3];
		System.out.println(array.getClass().getName());
		
		
//3d Array
		
		int[][][] x = {{{10,20,30},{40,50,60}}, {{70,80},{90,100}}};
		
		System.out.println(x[0][1][2]);
		
		System.out.println(x[1][0][2]);
		
		System.out.println(x[1][1][1]);
		
		System.out.println(x[1][2][0]);
		
		System.out.println(x[2][1][0]);
	
	}

}
