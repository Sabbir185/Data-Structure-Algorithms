package stack;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackFile<Integer> stack = new StackFile<Integer>(10);
       
		stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        while (!stack.isEmptyStack())
        {
            System.out.println( stack.pop() );
        }

	}

}
