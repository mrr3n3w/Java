/**
 * @author Jordan
 * 300219995
 */

public class Cards {
	    
	private int rank;  // 1,2,3 .. 13 (King)
	private int suit;  // 0 - Spade, 1 - Heart, 2 - Club, 3 - Diamond
	
	public Cards(int r, int s)
	{
		rank = r;
	    suit = s;
	}
	public int getRank() 
	{ 
		return rank; 
	}
	public int getSuit() 
	{ 
		return suit; 
	}
	public String toString() 
	{
		String cardName = "";
	    switch(rank) 
	    {
            case 1: 
            	cardName = "Ace of "; 
            	break;
            case 11: 
            	cardName = "Jack of "; 
            	break;
            case 12: 
            	cardName = "Queen of "; 
            	break;
            case 13: 
            	cardName = "King of "; 
            	break;
            default: 
            	cardName = rank + " of ";
	    }
	    switch(suit) 
	    {
	        case 0: 
	        	cardName += "Spades"; 
	        	break;
	        case 1: 
	        	cardName += "Hearts"; 
	        	break;
	        case 2: 
	        	cardName += "Clubs"; 
	        	break;
	        case 3: 
	        	cardName += "Diamonds";
	    }
	        return cardName;
    }
}