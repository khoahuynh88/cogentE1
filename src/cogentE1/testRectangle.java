package cogentE1;

import java.util.Scanner;

public class testRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++)
		{ 
		System.out.println("Enter your length");
		int a = sc.nextInt();
		
		System.out.println("Enter your bread");
		int b = sc.nextInt();
		Rectangle r = new Rectangle(a,b);
		
		
		r.calcArea();;
		r.calcPeri();
		r.display();
		}
	}

}
