package recursion;

import java.util.Scanner;

public class RecursiveBianraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = {2,4,9,15,21,27,33,185};
		System.out.println("Enter the value : ");
		int N = sc.nextInt();
		System.out.println("The position is : "+ binaryRecursive(arr,0,arr.length-1,N) );
	}
	
	public static int binaryRecursive(int []a,int low,int high, int N)
	{
		int mid = (low+high)/2 ;
		
		if(low>high)
			return -1;
		else if( N==a[mid] ) {
			return mid+1;
		}
		else if( N > a[mid] ) {
			low = mid + 1 ;
			return binaryRecursive(a,low,high,N);
		}
		else {
			high = mid - 1 ;
			return binaryRecursive(a,low,high,N);
		}
			
	}
	

}
