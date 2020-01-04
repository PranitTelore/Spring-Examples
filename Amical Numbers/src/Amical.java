/*
 
  Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
 amicable pairs are: (220, 284)
 
*/


import java.util.Scanner;

public class Amical {

	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter X :");
		int x = sc.nextInt();
		
		System.out.println("Enter Y :");
		int y = sc.nextInt();
		
		int sum_x=0,sum_y=0;
		
		for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                sum_x += i;
        }
		
		for(int i=1;i<=y;i++) {
			if(y%i==0)
				sum_y +=i;
		}
		
		if(sum_x==sum_y)
		{
			System.out.println("Amical Numbers");
		}
		else
		{
			System.out.println("Not Amical");
		}
			
	}

}

/*   Output
 
 
 Enter X :
220
Enter Y :
284
Amical Numbers



*/
