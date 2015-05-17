import java.util.ArrayList;

public class Player{
    //holds the players cards that are not visible to other players
    private ArrayList<Card> hiddenHand;
    //holds the players cards which are visible to all players
    private ArrayList<Card> visibleHand;
    //The player's name
    private String Name;

    public Player(String Name){
	hiddenHand = new ArrayList<Card>();
	visibleHand = new ArrayList<Card>();
	this.Name = Name;
    }

    //Gives the player a hidden card
    public void giveHidden(Card card){
	hiddenHand.add(card);
    }

    //Gives the player a visible card
    public void giveVisible(Card card){
	visibleHand.add(card);
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
	ArrayList<Card> ans = new ArrayList<Card>();
	for (Card card : hiddenHand) ans.add(card);
	for (Card card : visibleHand) ans.add(card);
	return ans;
    }

    //Returns value of all the cards in the players hand. Does not currently deal with ace exception
    public int getValue(){
	int ans = 0;
	for (Card card : hiddenHand) ans+=card.getValue();
	for (Card card : visibleHand) ans+=card.getValue();
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
	
	
	    
