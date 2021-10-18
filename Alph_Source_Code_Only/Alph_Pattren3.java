import java.util.Scanner;
public class Alph_Pattren3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows you want");
		int row = sc.nextInt();//9
		System.out.println("enter how many numbers you want initially");
		int num = sc.nextInt();//5
		System.out.println("enter how many space you want initially");
		int sp = sc.nextInt();//0
		int k=2;
		
		for(int i=1;i<=row;i++) {
			for(int a=1;a<=sp;a++) {
				System.out.print("  ");
			}
			if(i<=row/2+1)
			for(int j=i;j<=num;j++) {
				System.out.print((char)(j+64)+" ");
			}
			else {
				for(int j=i-k;j<=num;j++) {
					System.out.print((char)(j+64)+" ");
				}
				k=k+2;}
			System.out.println();
			if(i<row/2+1)
				sp++;
			else
				sp--;	
		}
	}

}

/*

enter how many rows you want
11
enter how many numbers you want initially
6
enter how many space you want initially
0
A B C D E F 
   B C D E F 
     C D E F 
       D E F 
          E F 
             F 
          E F 
       D E F 
     C D E F 
  B C D E F 
A B C D E F 


*/