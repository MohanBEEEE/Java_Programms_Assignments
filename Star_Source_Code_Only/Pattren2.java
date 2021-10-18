import java.util.Scanner;
class Pattren2{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	int str = 1;
	int sp = 2;
	for(int i=1;i<=row;i++){
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
*
* *
* * *
* * * *
* * * * *

/*