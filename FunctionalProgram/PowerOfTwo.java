package FunctionalProgram;
import java.util.Scanner;
public class PowerOfTwo {
	public static int powerValue(int n) {
		if(n==0)
			return 1;
		else
			return 2*powerValue(n-1);
	}
	public static void main(String args[]) {
		System.out.println("Enter the value of N");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int value[] = 	new int[n];
		for(int i=0;i<n;i++) {
			value[i]=powerValue(i);
			System.out.println(value[i]);
		}
		scan.close();
		
	}

}
