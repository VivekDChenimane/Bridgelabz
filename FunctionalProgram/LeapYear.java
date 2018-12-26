package FunctionalProgram;
import java.util.Scanner;
public class LeapYear {
	public static boolean
	leap(int year) {
		if(year%400==0 & year%4==0 || year%100!=0)
			return true;
		else
			return false;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		boolean i = leap(year);
		if(i)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		scan.close();
	}
}
