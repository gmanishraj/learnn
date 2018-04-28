package basic;

public class Hellopattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1;
		int space=4;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
			
			star++;
			space--;
			
		}
			System.out.println();
		}
	}

}
