import java.util.Scanner;
public class Num_Pattren11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//7
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=row;j++) {
				if(i==j)
					System.out.print(j+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
			

		sc.close();
}
}

/*

enter how many rows you want
6

0 0 0 0 0 0 0
0 1 0 0 0 0 0
0 0 2 0 0 0 0
0 0 0 3 0 0 0
0 0 0 0 4 0 0
0 0 0 0 0 5 0
0 0 0 0 0 0 6

*/