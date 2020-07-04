package sorting;

public class SeletionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {20,12,5,7,2,1};
		SeletionSort.sortAlgo(arr);
		
		for(int i=0; i<arr.length; i++ )
		{
			System.out.print(arr[i]);
			if(i<arr.length-1)
				System.out.print(" ");
		}

	}
	
	public static int[] sortAlgo(int []a)
	{
		for(int i=0 ; i<a.length-1; i++)
		{
			int min = i ;
			for(int j=i+1; j<a.length; j++ )
			{
				if( a[min] > a[j] )
				{
					min = j ;
				}
			}
			int temp = a[i] ;
			a[i] = a[min];
			a[min] = temp ;
		}
		
		return a ;
	}

}
