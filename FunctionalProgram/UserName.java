package FunctionalProgram;
import java.util.Scanner;
public class UserName {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String Name = scan.next();
		System.out.println("Hello "+Name+",How are you");
		scan.close();
		}
}
