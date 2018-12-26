package FunctionalProgram;
import java.util.Scanner;
public class HarmonicNumber {
	public static double harmonicFunc(int n) {
		double sum=0.0;
		if(n>0) {
			sum = (1.0/n)+harmonicFunc(n-1);
			System.out.println(sum);
		}
		return sum;
	}
	public static void main(String args[]) {
		System.out.println("Enter the value of N");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double value = harmonicFunc(n);
		System.out.println("The harmonic value of "+n+" is:"+value);
		scan.close();
	}
}
