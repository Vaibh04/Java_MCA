import java.util.Scanner;
public class SI
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		float p=sc.nextFloat();	
		System.out.print("Enter Rate: ");
		float r=sc.nextFloat();	
		System.out.print("Enter Time: ");
		float t=sc.nextFloat();		
		SimpleInt(p,r,t);	
	}

	static void SimpleInt(float p,float r,float t)
	{
		float si=(p*r*t)/100;
		System.out.println("The simple interest is: "+si);
	}

}