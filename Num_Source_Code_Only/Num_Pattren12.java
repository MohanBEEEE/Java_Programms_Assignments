import java.util.Scanner;
public class Num_Pattren12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//5
		
		
		for(int i=1;i<=row;i++) {
			int k=row-1;
			for(int j=1;j<=i;j++) {
				if(j==1)
				     System.out.print(i+" ");
				else
				     {System.out.print(i+k+" ");
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

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/