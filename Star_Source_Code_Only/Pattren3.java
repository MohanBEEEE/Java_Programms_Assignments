import java.util.Scanner;
class Pattren3{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many stars you initially");
	int str = sc.nextInt();
	System.out.println("Enter how many space you initially");
	int sp = sc.nextInt();
	for(int i=1;i<=row;i++){
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

Enter how many rows you want
5
Enter how many stars you initially
5
Enter how many space you initially
0
* * * * *
* * * *
* * *
* *
*

*/

