import java.util.*;
public class elseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num1= sc.nextInt();
		sc.nextLine();	
    
			//else if Condition
   	if(num1<0) {
			System.out.println("Negative Number");
		}
		else if(num1>0)
		{
			System.out.println("Positive number");
		}
		else {
			System.out.println("negative number");
		}
	}

}
