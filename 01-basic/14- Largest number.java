import java.util.Scanner;
public class largest 
{
  public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1= sc.nextInt();
		sc.nextLine();	
		System.out.println("enter second number:");
		int num2= sc.nextInt();
		sc.nextLine();	
		System.out.println("enter third number:");
		int num3= sc.nextInt();
		sc.nextLine();	
    
		// If Else If Condition
		if (num1>num2 && num1>num3) {
			System.out.println("Largest number:"+num1);
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("largest Number:"+num2);
		}
		else {
			System.out.println("largest number:"+num3);
		}
		}
