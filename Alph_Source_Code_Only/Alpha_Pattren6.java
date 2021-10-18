import java.util.Scanner;
public class Alpha_Pattren6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		int k=4;
		
		for(int i=1;i<=row;i++) {
			for(int j=i;j<=i+k;j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

}

/*

enter how many rows you want
5

A B C D E
B C D E F
C D E F G
D E F G H
E F G H  I

*/