import java.util.Scanner;
class Pattren5{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many stars you want initially");
	int str = sc.nextInt();
	System.out.println("Enter how many space you want initially");
	int sp = sc.nextInt();
	for(int i=1;i<=row;i++){
	     for(int a=1;a<=sp;a++){
	          System.out.print("  ");
	         }
	      for(int j=1;j<=str;j++){
		System.out.print("* ");
	           }
	System.out.println(" ");
	str--;
	sp++;
	}
	}

}

/*

5
Enter how many stars you want initially
5
Enter how many space you want initially
0
* * * * *
   * * * *
      * * *
         * *
            *

*/