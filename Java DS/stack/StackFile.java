package stack;

import java.util.Objects;
// Generic type Array
public class StackFile<E> {

	private E[] data;
	private int t =-1;
	private int capacity;
	
	public StackFile(int capacity)
	{
		this.capacity = capacity;
		data = (E[]) new Object[capacity];
	}
	
	public int size()
	{
		return (t+1);
	}
	
	public boolean isEmptyStack()
	{
		if(t==-1)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	public boolean isFullStack()
	{
		if(t==(capacity-1))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public void push(E element)
	{
		try 
		{
			if(isFullStack())
			{
				System.out.print("Stack is full");
			}
			else
			{
				t++;
				data[t] = element;
			}
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
	public E pop()
	{
		try 
		{
			if(isEmptyStack())
			{
				System.out.print("Stack is empty");
				return null;
			}
			else
			{
				E element = data[t];
				data[t] = null;
				t--;
				return element;
			}
		}
		catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}
	
	public E peek()
	{
		try 
		{
			if(isEmptyStack())
			{
				System.out.print("Stack is empty");
				return null;
			}
			else
			{
				E element = data[t];
				return element;
			}
		}
		catch (Exception e) {
			System.out.print(e);
			return null;
		}
	
	}




}
