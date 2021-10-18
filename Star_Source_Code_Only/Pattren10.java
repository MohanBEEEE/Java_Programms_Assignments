import java.util.Scanner;
class Pattren10{
	public static void main(String[] arg)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many rows you want");
	int row = sc.nextInt();//5
	System.out.println("Enter how many stars you want initially");
	int str = sc.nextInt();//1
	System.out.println("Enter how many space you want initially");
	int sp = sc.nextInt();//2

	for(int i=1;i<=row;i++){
	     for(int a=1;a<=sp;a++){
	          System.out.print("  ");
	         }
	      for(int j=1;j<=str;j++){
		System.out.print("* ");
	           }
	System.out.println();
	
	if(i<=row/2){
	sp--;
	str=str+2;
	}
	else{
	sp++;
	str=str-2;
	}
	}
	}
	}

/*
Enter how many rows you want
5
Enter how many stars you want initially
1
Enter how many space you want initially
2
      *
    * * *
 * * * * *
    * * *
      *
*/