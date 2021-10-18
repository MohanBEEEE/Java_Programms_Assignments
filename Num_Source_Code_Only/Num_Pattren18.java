import java.util.Scanner;
public class Num_Pattren18 //pascal triangle// 
                 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		System.out.println("enter how many space you want");
		int sp = sc.nextInt();//9
		
		
		for(int i=1;i<=row;i++) {
			for(int a=1;a<=sp;a++) {
				System.out.print(" ");
			}
			int k=1;
			for(int j=1;j<=i;j++) {
				{System.out.print(k+" ");
				k=k*(i-j)/j;}
			}
			System.out.println();
			sp--;
		}
	}

}

/*

enter how many rows you want
5
enter how many space you want
4
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/