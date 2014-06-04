/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class Hand {
	
	private Cards[] cardsInHand = new Cards[5];
	private int count = 5;
	Cards card;
	
	public void add(Cards deal) 
	{
		for(int i = 0; i < count; i++)
		{
			if (cardsInHand[i] == null)
			{
				cardsInHand[i] = deal;
				count++;
				return;
			}
		}
	}
	public Cards drop(int i)
	{
		Cards drop = cardsInHand[i];
		cardsInHand[i] = null;
		count--;
		return drop;
		
		
	}
    public String toString() 
    {
        String currentHand = "";
        for (int i = 0 ; i < cardsInHand.length ; i++) 
        {
            if (cardsInHand[i] != null) 
            	{
            		currentHand += cardsInHand[i] + "\n";
            	}
        }
        return currentHand;
    }
	public int getCount() 
	{
		return count;
	}
}
