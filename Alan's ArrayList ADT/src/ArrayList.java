/**
 * 
 */

/**
 * @author Jordan 300219995
 */
public class ArrayList
{
	Node head;
	int size;

	public void add( Object x )
	{
		
	}

	public void insertItem( Object x, int i )
	{

	}

	public void remove( Object x )
	{

	}

	public void removeItemAt( int index )
	{
		Node current = head;

		if (index >= size)
		{
			return;
		}
		if (index == 0)
		{
			head = head.next;
		} else
		{
			for (int i = 0; i < index - 1; i++)
			{
				current = current.next;
			}
			current.next = current.next.next;
		}
		size--;
	}

	public void count()
	{

	}

	public Object getDataAt( int i )
	{
		Node current = head;
		if (i >= size)
		{
			return null;
		}
		for (int k = 0; k < i; k++)
		{
			current = current.next;
		}
		return current.data;
	}

}
