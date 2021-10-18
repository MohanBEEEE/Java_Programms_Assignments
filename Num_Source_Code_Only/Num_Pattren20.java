import java.util.Scanner;
public class Num_Pattren20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		
		
		for(int i=1;i<=row;i++) {
			int k=5;
			for(int j=1;j<=i;j++) {
				if(j==1)
				System.out.print(i+" ");
				else
					{System.out.print(i+k+" ");
				k=k+row;}
			}
			System.out.println();
			
		}
	}

}

/*

enter how many rows you want
5

1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25



*/