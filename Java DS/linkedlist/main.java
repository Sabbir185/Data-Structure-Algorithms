package linkedlist;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		boolean stop = true;
		while (stop) 
		{
			System.out.println("");
			System.out.println("1. add item to the list at first position");
			System.out.println("2. add Last position");
			System.out.println("3. add at position");
			System.out.println("4. delete first position");
			System.out.println("5. delete last position");
			System.out.println("6. delete at position");
			System.out.println("7. for view list");
			System.out.println("8. for exit");
			System.out.println("Enter your choose :- ");

			int n = scanner.nextInt();
			int value;
			switch (n) 
			{
			case 1:
				System.out.println("Enter value : ");
				value = scanner.nextInt();
				list.insertAtFirst(value);
				break;
			case 2:
				System.out.println("Enter value : ");
				value = scanner.nextInt();
				list.insertAtLast(value);
				break;
			case 3:
				System.out.println("Please enter position : ");
				int posi = scanner.nextInt();
				System.out.println("Enter value : ");
				int val = scanner.nextInt();
				list.insertAtPosition(val, posi);
				break;
			case 4:
				list.deleteAtFirst();
				break;
			case 5:
				list.deleteAtLast();
				break;
			case 6:
				System.out.println("Please enter position : ");
				int positi = scanner.nextInt();
				list.deleteAtPosition(positi);
				break;
			case 7:
				list.viewList();
				break;
			case 8:
				System.out.println("Thank you !");
				stop = false ; // there are various ways to stop loop !
				break;
			default:
				System.out.println("Invalid choose !");
			}
		}

	}

}
