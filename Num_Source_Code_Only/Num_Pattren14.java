import java.util.Scanner;
public class Num_Pattren14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		int k=2;
		
		for(int i=1;i<=row;i++) {
		if(i<=row/2+1)
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			else {
				for(int j=1;j<=i-k;j++) {
					System.out.print(j+" ");
				}
			            k=k+2;}
			System.out.println();
			
		}
		
		sc.close();
	}

}

/*

enter how many rows you want
9
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/