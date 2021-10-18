import java.util.Scanner;
public class Num_Pattren16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		System.out.println("enter how many numbers you want initially");
		int num = sc.nextInt();//9
		
		for(int i=1;i<=row;i++) {
			for(int j=num;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<row/2+1)
				num--;
			else
				num++;
		}
	}

}

/*

enter how many rows you want
9
enter how many numbers you want initially
5

5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

*/