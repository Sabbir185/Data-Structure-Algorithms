package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {9,8,99,8,102,12,33};
		InsertionSort.sortAlgo(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print(" ");
		}
	}
	
	public static int[] sortAlgo(int[]a)
	{
		for(int i = 1 ; i<a.length; i++ )  // debug to understand better .
		{
			int element = a[i];
			int j = i-1 ;
			while( j>=0 && a[j] > element )
			{
				a[j+1] = a[j] ;
				j-- ;
			}
			a[j+1] = element ;
		}
		return a ;
	}

}
