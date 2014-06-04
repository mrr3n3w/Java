/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class PlayingCards {
    
	public static void main(String[] args) 
	{
		int count = 5;
        Cards x1 = new Cards(1,0);
        Cards x2 = new Cards(12,3);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println();
        System.out.println();
        Deck d1 = new Deck(52);
       
        //System.out.println(d1); //Print the deck
        d1.shuffle(); //Shuffle the deck
        //System.out.println(d1);//print shuffled deck
        d1.sort();    //back to original
        //System.out.println(d1);//print the original
        d1.shuffle(); //shuffle again
        //System.out.println(d1);// print shuffled deck
        d1.sortByRank();
        System.out.println(d1);
        d1.shuffle();
        
        Cards[] hand = new Cards[7];
        for(int i=0; i<7; i++)
    	{
    		hand[i]=d1.deal();
    	}
        for(int i=0; i<7; i++) 
    	{
    		System.out.println(hand[i]);
    	}
        
        d1.shuffle();
        System.out.println();
        System.out.println(d1.deal());
        System.out.println();
        Hand myPokerHand = new Hand();
        
        for(int i = 0; i < 5; i++) 
    	{
    		myPokerHand.add(d1.deal());
    	}
        System.out.println();
        System.out.println("The hand:\n" + myPokerHand + "\n");
        System.out.println("Drop 2 cards: " + myPokerHand.drop(3) + ", " + myPokerHand.drop(0));
        System.out.println("\nThe Hand:\n" + myPokerHand);
    }
}