import java.util.Scanner;
class Pattren2C{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many star you want initially");
	int str = sc.nextInt();
	System.out.println("Enter how many space you want initially");
	int sp = sc.nextInt();
	for(int i=1;i<=row;i++){
	      for(int j=1;j<=str;j++){
		System.out.print("*");
	           }

		System.out.print(" ");
	           
	      for(int k=1;k<=str;k++){
		System.out.print("*");
	           }
	System.out.println();
	str++;
	
	}
	}

}

/*

Enter how many rows you want
8
Enter how many star you want initially
1
Enter how many space you want initially
0
* *
** **
*** ***
**** ****
***** *****
****** ******
******* *******
******** ********

*/