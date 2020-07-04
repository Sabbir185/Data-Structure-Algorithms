package QueueDS;

public class QueueClass<E> {

    private E []data ;  // generic array used for storage
    private int size = 0;
    private int rear = -1 ;
    private int front = 0 ;
    private int capacity ;


    QueueClass( int capacity )
    {
        this.capacity = capacity ;
        data = (E[]) new Object[capacity];
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size == 0 ) ;
    }

    public boolean isFull()
    {
        return (size == capacity ) ;
    }

    public void enqueue(E element)
    {
        try{
            if( isFull() )
                System.out.println("Queue is Full");
            else {
                //rear++ ; not right way
                rear = (rear+1) % data.length ;
                data[rear] = element ;
                size++ ;
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public E dequeue()
    {
        try{
            if (isEmpty())
            {
                System.out.println("Queue is Empty");
                return null;
            }
            else {
                E element = data[front];
                data[front] = null ;
                front = (front+1) % data.length ;
                size-- ;
                return element ;
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public E first()  // just peek the value not remove front element
    {
        try{
            if (isEmpty())
            {
                System.out.println("Queue is Empty");
                return null;
            }
            else {
                E element = data[front];
                return element ;
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

