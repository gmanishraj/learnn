package basic;

import java.util.Scanner;

public class Binarytodecimal {
	
	public static void main(String[] args)
	{
//		int a=10,b=20,c=0;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("A value is " +a);
//		System.out.println("B value is " +b);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		int row =sc.nextInt();
		int mul=1,remainder=0,binary=0;
		while(row!=0)
		{
			remainder=row%10;
			binary=binary+mul*remainder;
			mul=mul*2;
			row=row/10;
		}
		System.out.println("binary number is " +binary);
	}

}
