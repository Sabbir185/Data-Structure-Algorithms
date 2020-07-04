package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = {8,6,3,1,33,22,55,70};
		Arrays.sort(arr);
		int n = sc.nextInt();
		BinarySearching.searchingAlgo(arr, n);
		
		// for sorted array print
		System.out.print("Your Sorted List : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void searchingAlgo(int []a, int n )
	{
		int low = 0;
		int heigh = a.length-1;
		int mid = (low+heigh)/2 ;
		
		for(int i=0 ; i<a.length; i++)
		{
			if( n==a[mid] ) {
				System.out.println("Position No. : "+(mid+1));
				break;
			}
			else if( n<a[mid] )
				heigh = mid - 1 ;
			else
				low = mid + 1;
			mid = (low+heigh)/2 ;
		}
	}

}
