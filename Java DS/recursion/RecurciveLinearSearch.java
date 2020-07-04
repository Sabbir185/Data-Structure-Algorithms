package recursion;
import java.util.Scanner;

public class RecurciveLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		System.out.println(recurciveSearch(new int[] {7,3,1,9,8,4}, 0 , n)) ; // 0 index start & n value to 
																				// be searching the position

	}

	public static int recurciveSearch(int []a,int i,int x)
	{
		if( i > a.length )
			return -1 ;
		else if( a[i]==x )
			return i ;
		else
		{
			System.out.println("Index position : "+i);
			return recurciveSearch(a,i+1,x);  // method call itself & work like a loop !! :)
		}
	}
}
