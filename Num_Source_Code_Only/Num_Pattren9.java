import java.util.Scanner;
public class Num_Pattren9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//7
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			
		}
		System.out.println();
	}
		sc.close();
}
}

/*

enter how many rows you want
7

1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1

*/