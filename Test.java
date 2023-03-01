import java.util.Scanner;
class Test
{
	static int a,b,sum;
	
	public static void main(String args[])
	{	
		get_input();
		calc();
		display();
	}	

	static void get_input()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		a=sc.nextInt();
		System.out.print("Enter 2st Number: ");
		b=sc.nextInt();
	}		
	
	static void calc()
	{
		sum=a+b;		
	}

	static void display()
	{	
		System.out.println("The sum is: "+sum);
	}

} // end of class test