import java.util.Scanner;
class Pattren1{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many columns you want");
	int col = sc.nextInt();
	
	for(int i=1;i<=row;i++){
	      for(int j=1;j<=col;j++){
		System.out.print("* ");
	           }
	System.out.println(" ");
	}
	}

}

/*
Enter how many rows you want
5
Enter how many columns you want
5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/