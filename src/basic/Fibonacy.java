package basic;

import java.util.Scanner;

public class Fibonacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Scanner scan=new Scanner(System.in);
		int startnum=0,secondrnumber=1,sizenumber=1;
		sizenumber=scan.nextInt();
		System.out.println(startnum+ " "+secondrnumber);
		for(int i=1;i<=sizenumber;i++)
		{
			int thirdnumber=startnum+secondrnumber;
			startnum=secondrnumber;
			secondrnumber=thirdnumber;
			System.out.println
			(thirdnumber);
		}
		

	}

}
