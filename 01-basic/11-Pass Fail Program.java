import java.util.*;
public class Passfail 
{
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Marks:");
		int marks=sc.nextInt();
		sc.nextLine();
			//If Else condition
		if(marks>40)
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
