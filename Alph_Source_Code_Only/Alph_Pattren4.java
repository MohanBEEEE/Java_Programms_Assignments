import java.util.Scanner;
class Alph_Pattren4{
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
	          System.out.print((char)(65)+" ");
	         }
	      for(int j=1;j<=num;j++){
		System.out.print((char)(num+64)+" " );
	           }
	System.out.println();
	num++;
	con--;
	}
	}

}

/*

Enter how many rows you want
6
Enter what number you want insted *
1
Enter how many constent number you want insted of space initially
5

A A A A A A
A A A A B B
A A A C C C
A A D D D D
A E E E E E
F F F F F F

*/