package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {20,-1,30,24,11};
		
		for(int lastIndex=arr.length-1 ; lastIndex>0 ; lastIndex-- )
		{
			for( int j=0; j<lastIndex; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swip(arr, j, j+1);
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void swip(int []arr,int i,int j)
	{
		if( i==j) {
			return ;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
