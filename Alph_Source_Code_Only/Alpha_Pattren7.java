import java.util.Scanner;
public class Alpha_Pattren7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		int k=1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(k+64)+" ");
				k++;
			}
			System.out.println();
			
		}
	}

}

/*

enter how many rows you want
5

A 
B C 
D E F 
G H I J 
K L M N O 

*/