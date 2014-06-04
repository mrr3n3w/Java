/**
 * @author Jordan
 * 300219995
 */
public class Deck {
    private Cards[] deck;
    private int top;
    
    public Deck (int n) 
    {
        deck = new Cards[n];
        for(int i=0; i<n; i++) 
        {
            deck[i] = new Cards(1+i%13, i/13);
        }
        top = 0;
    }
    public void swap(int x, int y) 
    {
        Cards temp = deck[x];
        deck[x] = deck[y];
        deck[y] = temp;
    }
    public void shuffle() 
    {
        for(int i = 0; i < deck.length; i++) 
        {
            int k = (int)(Math.random()*deck.length);
            swap(i,k);
        }
    }
    public void sort() 
    {
    	for(int i = 0; i < deck.length; i++) 
        {
            for(int h = deck.length-1; h > i; h--) 
            {
                int index1 = deck[h-1].getRank() + 13*deck[h-1].getSuit();
                int index2 = deck[h].getRank() + 13*deck[h].getSuit();
                if(index1 > index2) 
                {
                	swap(h-1,h);
                }
            }
        }
    }
    public void sortByRank()
    {
    	for(int i = 0; i < deck.length; i++) 
        {
            for(int h = deck.length-1; h > i; h--) 
            {
                int index1 = deck[h-1].getRank()*4 + deck[h-1].getSuit();
                int index2 = deck[h].getRank()*4 + deck[h].getSuit();
                if(index1 > index2) 
                {
                	swap(h-1,h);
                }
            }
        }	
    }
    public Cards deal() 
    {
        top++;
        if(top <= deck.length) 
        	{
        		return deck[top-1];
        	}
        else return null;
    }

    public String toString() 
    {
        String result = "";
        for(int i=0; i<deck.length; i++) 
        {
            result += deck[i] + "\n";
        }
        return result;
    }
}