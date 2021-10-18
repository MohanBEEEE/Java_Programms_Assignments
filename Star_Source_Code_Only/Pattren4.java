import java.util.Scanner;
class Pattren4{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many stars you want");
	int str = sc.nextInt();
	System.out.println("Enter how many space you want");
	int sp = sc.nextInt();
	for(int i=1;i<=row;i++){
	     for(int a=1;a<=sp;a++){
	          System.out.print("  ");
	         }
	      for(int j=1;j<=str;j++){
		System.out.print("* ");
	           }
	System.out.println(" ");
	str++;
	sp--;
	}
	}

}

/*

Enter how many rows you want
5
Enter how many stars you want
1
Enter how many space you want
4
           *
         * *
      * * *
   * * * *
* * * * *

*/