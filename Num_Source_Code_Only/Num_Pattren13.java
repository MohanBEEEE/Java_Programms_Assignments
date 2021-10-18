import java.util.Scanner;
public class Num_Pattren13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//7
		int k=0;
		
		for(int i=1;i<=row;i++) {
			int l=1;
			for(int j=1;j<=i+k;j++) {
				
				if(j<=i)
					System.out.print(j+" ");
				else
					{System.out.print(j+k-i-l +" ");
				l=l+2;}
			}
			System.out.println();
			k++;
			
		}
		
		sc.close();
	}
}

/*

enter how many rows you want
7

1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1

*/