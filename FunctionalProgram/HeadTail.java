package FunctionalProgram;

import java.util.Scanner;

public class HeadTail {
		public static void flip(int flip){
			int head = 0;
			int tail = 0;
			double a[] = new double[flip];
			if(flip<0)
				System.out.println("Enter the proper value");
			else
				for(int i=0;i<flip;i++)
					a[i]=Math.random();	/* Generates random numbers between 0 and 1 */
			for(int i=0;i<flip;i++){
				if(a[i]<0.5)
					tail++;
				else
					head++;
				}
			double headperc = (head*100)/flip;
			double tailperc = (tail*100)/flip;		
			System.out.println("Head perc:"+headperc);
			System.out.println("Tail perc:"+tailperc);
		}
		public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of times to flip a coin");
			int flip = scan.nextInt();
			flip(flip);
			scan.close();
		}
	
}
