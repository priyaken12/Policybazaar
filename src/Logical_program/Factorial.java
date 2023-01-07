package Logical_program;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5, fact=1;         //1,2,6,24,
		
		for(int i=1;i<=5;i++)       //1<5,2<5,3<5,4<5,5=5
		{
			fact=fact*i;            //fact=1,2,6,24,120
		}
		
		System.out.println(fact);
		
	}

}
