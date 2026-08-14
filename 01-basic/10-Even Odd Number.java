import java.util.*;
public class Evenodd
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num= sc.nextInt();
	sc.nextLine();
	if(num%2==0) 
	{
		System.out.println("Even number");
	}
	else
  {
		System.out.println("Odd number");
		}
}
}
