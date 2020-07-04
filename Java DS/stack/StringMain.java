package stack;

public class StringMain {

    public static void main(String[] args) {

        reverseString("OLLEH") ;  // method calling

        System.out.println( reverseString("OLLEH") ); // print return string

    }

    public static String reverseString( String name )
    {
        int capacity = name.length(); // size of stack from argument
        StackFile<Character> stack = new StackFile<>(capacity);

        for (int i = 0; i < name.length() ; i++)
        {
            char ch = name.charAt(i) ;
            stack.push(ch);
        }

        String result = "";

        while (!stack.isEmpty())
        {
            result = result + stack.pop();
        }

        return result;
    }


}
