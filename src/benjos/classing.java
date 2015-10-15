package benjos;
import java.util.Scanner;
public class classing {
	public static void array()
	{
			try{
			int a[]= new int [ 7];
			a[ 4]=30 / 0;
			System.out .println( "First program");
			}
			catch( ArithmeticException e){
			System. out.println( "Warning:Try Again!");
			}
			catch( ArrayIndexOutOfBoundsException e)
			{
			System. out.println( "Warning:Try again");
			}
			catch( Exception e){
			System. out.println( "Warning: Work Later");
			}
			System.out .println( "Out of try-cat");
			}
			
public static void main(String[] args) 
{
classing callit=new classing();	
callit.array();
}
}
