import java.util.Scanner;
class Num_Pattren7{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();//13
	System.out.println("Enter how many number you want to print initially");
	int num = sc.nextInt();//7

	for(int i=1;i<=row;i++){	
	    for(int j=1;j<=num;j++){	
	         System.out.print(j+" ");
	     }
	        System.out.println();
	        if(i>=(row/2)+1)
	              num--;
	        else
	              num++;
	          
	}
            }
        }

/*

Enter how many rows you want
13
Enter how many number you want to print initially
1

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/