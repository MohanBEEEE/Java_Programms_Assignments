import java.util.Scanner;
public class Num_Pattren19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		int k=1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			
		}
	}

}

/*

enter how many rows you want
5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


*/