import java.util.Scanner;
class Num_Pattren3{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter how many number you want insted initially");
	int num = sc.nextInt();

	for(int i=1;i<=row;i++){
	      for(int j=row;j>=num;j--){
		System.out.print(j+" " );
	           }
	System.out.println();
	num--;
	}
	}

}

/*

Enter how many rows you want
7
Enter how many number you want insted initially
7

7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1

*/