import java.util.Scanner;
public class Num_Pattren8A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//7
		System.out.println("enter how many space you want initally");
		int sp = sc.nextInt();
		int k=0;
		
		for(int i=1;i<=row;i++) {
			for(int a=1;a<=sp;a++) {
				System.out.print(" ");
			}
			
			if(i<=row/2+1)
			 
			for(int j=i;j<=row/2+1;j++) {
				System.out.print(j+" ");
			}
			else 
				for(int j=(row/2+1)-k;j<=row/2+1;j++) {
					System.out.print(j+" ");
				}
			
			System.out.println();
			if(i<row/2+1)
				sp++;
			else
				{sp--;
			    k++;}
		}
	}

}

/*

enter how many rows you want
13
enter how many space you want initally
0
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7

*/