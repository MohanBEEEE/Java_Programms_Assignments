import java.util.Scanner;
public class Alph_Pattren1{
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
				System.out.print((char)(64+j)+" ");
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

    A 
   A B 
  A B C 
 A B C D 
A B C D E 
 A B C D 
  A B C 
   A B 
    A 



*/
