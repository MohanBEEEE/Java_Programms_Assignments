import java.util.Scanner;
public class Num_Pattren10{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//7
		
		for(int i=1;i<=row;i++)
			if(i%2==0)
				{
				for(int j=1;j<=row;j++) {
					if(j%2==0)
						System.out.print("1 ");
					else
					    System.out.print("0 ");	
				}
				System.out.println();
				}
			else
			{
				for(int j=1;j<=row;j++) {
					if(j%2==0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				System.out.println();
			}
	
	}

}


/*

enter how many rows you want
7

1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1

*/