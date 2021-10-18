import java.util.Scanner;
public class Num_Pattren17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		System.out.println("enter how many numbers you want initially");
		int num = sc.nextInt();//
		System.out.println("enter how many space you want initially");
		int sp = sc.nextInt();//
		
		for(int i=1;i<=row;i++) {
			for(int a=1;a<=sp;a++) {
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<row/2+1)
				{num++;
				sp--;}
			else
				{num--;
				sp++;}
		}
	}

}

/*

enter how many rows you want
9
enter how many numbers you want initially
1
enter how many space you want initially
4

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