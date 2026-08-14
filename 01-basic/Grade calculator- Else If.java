import java.util.Scanner;
public class Gradecalculator 
{
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark:");
		float marks= sc.nextFloat();
		sc.nextLine();	
				
    // if else if condition
			if (marks>90) 	{
					System.out.println("grade:A");
			}
			else if(marks>75 && marks<90) {
				System.out.println("grade:B");
			}
			else if(marks>74 && marks<60) {
				System.out.println("grade:C");
			}
			else if(marks>59 && marks<40) {
				System.out.println("grade:D");
			}
			else {
				System.out.println("Fail");
				}
			}
}
