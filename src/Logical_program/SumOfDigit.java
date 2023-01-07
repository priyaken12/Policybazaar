package Logical_program;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=65845,rem,digit,Sum=0;
		
		while(num!=0)
		{
		rem=num%10;  //5 , 4,8,5,6
		
		num=num/10; // 6584,658,65,6,0
		
		Sum=rem+Sum; //5+0,5+4,9+8,17+5,22+6 
		             
		}
		System.out.println(Sum);
		
	}

}
