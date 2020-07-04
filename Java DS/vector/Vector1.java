package vector;

import java.util.Scanner;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>vc = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		for (int i = 0; i < n; i++) 
		{
			vc.add( k = sc.nextInt() );
			
		}
		vc.add(5);
		
		for( int v : vc)
		{
			System.out.println(v+" ");
		}

	}

}
