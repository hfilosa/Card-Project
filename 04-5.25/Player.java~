import java.util.ArrayList;

public class Player{
    //holds the players cards that are not visible to other players
    private ArrayList<Card> hiddenHand;
    //holds the players cards which are visible to all players
    private ArrayList<Card> visibleHand;
    //holds all of the player's cards
    private ArrayList<Card> totalHand;
    //The player's name
    private String Name;

    public Player(String Name){
	hiddenHand = new ArrayList<Card>();
	visibleHand = new ArrayList<Card>();
	totalHand = new ArrayList<Card>();
	this.Name = Name;
    }

    //Gives the player a hidden card
    public void giveHidden(Card card){
	hiddenHand.add(card);
	totalHand.add(card);
    }

    //Gives the player a visible card
    public void giveVisible(Card card){
	visibleHand.add(card);
	totalHand.add(card);
    }

    //Returns an arraylist of the player's hidden cards
    public ArrayList<Card> getHidden(){
	return hiddenHand;
    }

    //Returns an arraylist of the player's visible cards
    public ArrayList<Card> getVisible(){
	return visibleHand;
    }

    //Returns an arraylist of all of the player's cards
    public ArrayList<Card> getAll(){
        return totalHand;
    }

    //Returns value of all the cards in the players hand. Does not currently deal with ace exception
    public int getValue(){
	int ans = 0;
	for (Card card : totalHand) ans+=card.getValue();
	return ans;
    }

    //Returns value of the players hand in the context of blackjack
    //Returns 
    public int[] getBlackjackValue(){
	int permutations = 1;
	for (Card card : totalHand){
	    if (card.getValue()==14) permutations++;
	}
	int[] ans = new int[permutations];
	for (Card card : totalHand){
	    //Calculate value without aces
	    if (card.getValue()!=14){
		if (card.getValue()<11) ans[0]+=card.getValue();
		else ans[0]+=10;
	    }
	    //Add in value if all aces are 1
	    ans[0]+=(permutations-1);
	}
	//Create the remaining permutations by "changing" an ace to 11, one by one
	for (int i=1;i<permutations;i++){
	    ans[i]=ans[i-1];
	    ans[i]+=10;
	} 
	return ans;
    }

    public String toString(){
	String ans=Name+" has ";
	if (hiddenHand.size()!=0){
	    for (Card card : hiddenHand) ans+="a "+card+", ";
	    ans+=" in their hand";
	}
	if (visibleHand.size()!=0){
	    ans+=" and ";
	    for (Card card : visibleHand) ans+="a "+card+", ";
	    ans+=" on the table\n";
	}
	return ans;
    }
}
	
	
	    
