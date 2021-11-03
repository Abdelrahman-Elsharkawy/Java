import java.util.Scanner;
class Main
{
public static void main(String arg[])                                           //Main method
{
	   System.out.println("Enter a number");
	   Scanner input=new Scanner(System.in);
	   double n=input.nextDouble();
	   Factorial(n);
	   Harmonic_series(n);
}

	public static void Factorial(double n)                                      //Factorial method
{
	    double x=(int)n;
	    int fact=1;
	    for(int i=2;i<=x;i++)
	    {
	        fact*=i;
	    }
	    System.out.println("The factorial = "+fact); 
	    
}
	public static void Harmonic_series(double n){                               //Harmonic series method
       double sum=0;	
	   for(double i=1;i<=n;i++)
	{
	   sum=sum+(1/i);
	}
	   System.out.println("Harmonic value = "+sum);
}
}