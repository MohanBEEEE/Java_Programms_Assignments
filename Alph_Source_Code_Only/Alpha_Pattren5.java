import java.util.Scanner;
public class Alpha_Pattren5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//5
		
		
		for(int i=1;i<=row;i++) {
			int k=row-1;
			for(int j=1;j<=i;j++) {
				if(j==1)
				     System.out.print((char)(i+64)+" ");
				else
				     {System.out.print((char)(i+k+64)+" ");
				     k=k+row-j;}
			}
			System.out.println();
		}
		sc.close();
}
}

/*

enter how many rows you want
5

A
B F
C G J
D H K M
E  I  L  N  O

*/