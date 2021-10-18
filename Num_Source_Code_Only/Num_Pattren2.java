import java.util.Scanner;
class Num_Pattren2{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many number you want insted initially");
	int num = sc.nextInt();

	for(int i=1;i<=row;i++){
	      for(int j=1;j<=num;j++){
		System.out.print(j+" " );
	           }
	System.out.println();
	num++;
	}
	}

}

/*

Enter how many rows you want
7
Enter how many number you want insted initially
1

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

*/