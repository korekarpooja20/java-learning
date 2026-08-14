import java.util.Scanner;
public class UserInput 
{
	public static void main(String[] args) 
	{
		//input 
		Scanner sc=new Scanner(System.in);
		//use of next()
		String name=sc.next();  
		System.out.println("Name:"+name);
		
    //nextLine()
		String name1=sc.nextLine();
		System.out.println("Name:"+name1);
		
		//nextInt()
		int age=sc.nextInt();
		System.out.println("Age:"+age);

		//nextFloat()
		float marks =sc.nextFloat();
		System.out.println("Marks:"+marks);
	}
}
