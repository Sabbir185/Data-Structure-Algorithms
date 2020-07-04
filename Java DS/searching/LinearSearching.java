package searching;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = {2,10,44,-2,33,55};
		int n = sc.nextInt();
		
		LinearSearching.linearAlgo(arr, n);
		
	}
	
	public static void linearAlgo(int []a,int n)
	{
		int count=0,position=-1;
		for(int i=0; i<a.length; i++ )
		{
			if( n == a[i])
			{
				count = a[i];
				position = i+1 ;  // +1 for real life view , not array index :)
				break;
			}
		}
		if(position==-1)
		{
			System.out.println("Wrong !");
		}
		else
			System.out.println(position); 
	}

}
