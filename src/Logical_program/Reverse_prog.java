package Logical_program;

public class Reverse_prog {

	public static void main(String[] args) 
	{

		int No=65432,rem,rev=0;
		
		while(No!=0)
		{
			rem=No%10; //  2 , 3 ,4,5,6
			rev=rev*10+rem;  //0*10+2=2,0*10+3=3,0*10+4=4,0*10+5=5,0*10+6=6
			No=No/10;   //6543,654,65,6
		}
		System.out.println(rev);  //23456
		}
}