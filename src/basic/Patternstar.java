package basic;

import java.util.Scanner;

public class Patternstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("how many rows u want to enter");
	   Scanner sc =new Scanner(System.in);
	   int row=sc.nextInt();
	   for(int i=1;i<=row;i++)
	   {
		   for(int j=row;j>=i;j--)
		   {
			   System.out.print(j +"");
		   }
		   System.out.println();
	   }
	   
//	   for(int i=row-1;i>=1;i--)
//	   {
//		   for(int j=0;j<i;j++)
//		   {
//			   System.out.print(j +"");
//		   }
//		   System.out.println();
//	   }
		
		
	}
	
}