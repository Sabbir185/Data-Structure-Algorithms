package linkedlist;

public class LinkedList {
	
	private Node start ;
	private int size ;
	
	public LinkedList() 
	{
		this.start = null ;
		this.size = 0 ;
	}
	
	public boolean isEmpty()
	{
		if( start==null )
			return true;
		else
			return false;
	}
	
	public int getListSize() {
		return size ;
	}
	
	public void insertAtFirst( int val ) {
		Node n = new Node();		 // create node object
		n.setData(val);
		n.setNext(start);
		start=n;
		size++ ;
	}
	
	public void insertAtLast(int val) {
		Node n,t ;  			// t for indicate last node ;
		n = new Node(); 		// create node object
		n.setData(val);
		t = start ; 			// for  travels from start to last node ; initial t start from start
		if( t==null )
			start = n ;
		else 
		{
			while ( t.getNext() != null ) 
			{
				t = t.getNext();   // t has updated the last node ;
			}
			t.setNext(n);
		}
		size++ ;
		
	}
	
	public void insertAtPosition(int val, int position) 
	{
		if (position==1) 
			insertAtFirst(val);
		else if(position == size+1)
			insertAtLast(val);
		else if( position>1 && position<=size )   
		{
			Node n = new Node(val,null);
			Node t = start ; 				 // for position's before node ; initial t has started from start
			for(int i=1; i<position-1; i++ )    // size two has to reduce to add desire position ; travels t ;
				t = t.getNext();			// t has updated for next node address , before the required position ;
			n.setNext( t.getNext() );      // new node setup the link to next node
			t.setNext(n);                  // t refer node setup link to the new node 
			size++ ;
		}
		else
			System.out.println("Insert not possible at position : "+position);
	}
	
	public void deleteAtFirst() 
	{
		if(start==null)
			System.out.println("List is already Empty");
		else
		{
			start = start.getNext();
			size-- ;
		}
	}
	
	public void deleteAtLast() {
		if(start==null)
			System.out.println("List is already Empty");
		else if( size == 1 ) {
			start=null ;
			size-- ;
		}
		else
		{
			Node t ;
			t = start ;
			for(int i=1; i<size-1; i++)
				t = t.getNext();
			t.setNext(null);
			size-- ;
		}
	}
	
	public void deleteAtPosition(int position) {
		if(start==null)
			System.out.println("List is already Empty");
		else if(position<1 || position>size)
			System.out.println("Invalid position");
		else if(position==1)
			deleteAtFirst();
		else if(position==size)
			deleteAtLast();
		else 
		{
			Node t,t1 ;
			t = start;
			for(int i=1; i<position-1; i++)
				t = t.getNext();
			t1= t.getNext();
			t.setNext(t1.getNext());
			size-- ;
		}
	}
	
	public void viewList() {
		if(isEmpty())
			System.out.println("List is Empty :-");
		else
		{
			Node t ;
			t = start ;
			for (int i = 1; i <=size; i++) 
			{
				System.out.print(t.getData() );
				t = t.getNext();
				if(i<size)
					System.out.print(" ");
			}
		}
	}
	

}
