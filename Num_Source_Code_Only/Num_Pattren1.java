import java.util.Scanner;
class Num_Pattren1{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();
	System.out.println("Enter what number you want insted *");
	int num = sc.nextInt();
	System.out.println("Enter how many constent number you want insted of space initially");
	int con = sc.nextInt();

	for(int i=1;i<=row;i++){
	     for(int a=1;a<=con;a++){
	          System.out.print("1 ");
	         }
	      for(int j=1;j<=num;j++){
		System.out.print(num+" " );
	           }
	System.out.println();
	num++;
	con--;
	}
	}

}

/*

Enter how many rows you want
7
Enter what number you want insted *
1
Enter what is the constent number you want
6
1 1 1 1 1 1 1
1 1 1 1 1 2 2
1 1 1 1 3 3 3
1 1 1 4 4 4 4
1 1 5 5 5 5 5
1 6 6 6 6 6 6
7 7 7 7 7 7 7

*/