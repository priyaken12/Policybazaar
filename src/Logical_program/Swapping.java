package Logical_program;

public class Swapping {

	public static void m1() 
	{
		int a=10,b=30,c;
		
		System.out.println("Before swapping");
		System.out.println("A="+ a + " B="+ b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping");
		System.out.println("A="+ a + " B="+ b);
	}
	public static void m2()
	{
        int a=10,b=30,c;
		
		System.out.println("Before swapping");
		System.out.println("A="+ a + " B="+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping");
		System.out.println("A="+ a + " B="+ b);
			
	}
	
      public static void main(String[] args) 
      {
		
    	 m1();
    	 m2();
    	  	  
	  }
		
	}


