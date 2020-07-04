package vector;

import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        int []arr = {1,2,-8,8,40,41,23,03};
        Vector<Integer> vector = new Vector<Integer>(10,5);
        System.out.println("Initial Capacity : "+vector.capacity());
        vector.add(100);
        vector.add(200);
        vector.add(300);
        for (int i = 0; i < arr.length; i++) {
            vector.add(arr[i]) ;
        }
        System.out.println("After increment of Capacity : "+vector.capacity());
        vector.add(400);
        System.out.println("firstElement : "+vector.firstElement());
        System.out.println("lastElement : "+vector.lastElement());
        System.out.println("size of vector :"+vector.size());
        System.out.println("contains ? "+vector.contains(300));
        System.out.println("contains ? "+vector.contains(500));
        System.out.println("Find out elements index : "+vector.indexOf(1));

        System.out.println("Print all vector elements");
        for (int i = 0; i < vector.size() ; i++) {
            System.out.print(vector.elementAt(i)+" ");
        }
        System.out.println();
        System.out.println("WOW ! it is amazing .");
    }
}
