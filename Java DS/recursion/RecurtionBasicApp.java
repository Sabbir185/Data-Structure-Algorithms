package recursion;

public class RecurtionBasicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recutrion(5);

	}
	
	public static void  recutrion(int n)
	{
		if( n>=0 ) {
			recutrion(n-1);       // output is magic ! debug or better view ..
		}
		System.out.println(n);
	}

}
