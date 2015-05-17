import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;

public class Deck{
    //The cards in the deck are stored in a randomized order in the deck
    Stack<Card> Deck;

    public ArrayList<Card> orderedDeck(){
	//Create an arraylist of all the cards in a deck
	int[] Values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	String[] Suits = {"Hearts","Spades","Clubs","Diamonds"};
	ArrayList<Card> Final = new ArrayList<Card>();
	for (int val : Values){
	    for (String suit : Suits){
		String color="Red";
		if (suit.equals("Spades") || suit.equals("Clubs")) color="Black";
		String name = Integer.toString(val);
		if (val>10){
		    if (val==11) name="Joker";
		    if (val==12) name="Queen";
		    if (val==13) name="King";
		    if (val==14) name="Ace";
		}
		Card tmp = new Card(val, suit, color, name);
		Final.add(tmp);
	    }
	}
	return Final;
    }
    
    public Deck(){
	//Create an ordered deck
	ArrayList<Card> orderedDeck = orderedDeck();
	Deck = new Stack<Card>();
	Random rand = new Random();
	//Remove randomly from the sorted deck and add to the stack
	while (orderedDeck.size()>0){
	    Deck.push(orderedDeck.remove(rand.nextInt(orderedDeck.size())));
	}
    }

    public String toString(){
	String ans="";
	for (Card x : Deck){
	    ans+=x+"\n";
	}
	return ans;
    }

    //Deals a card from the top of the deck
    public Card deal(){
	if (Deck.empty()) throw new IllegalArgumentException("No cards left in the deck!");
	else return Deck.pop();
    }

    public static void main(String[] args){
	Deck d = new Deck();
	Player p = new Player("Henry");
	for (int i=0;i<4;i++) p.giveHidden(d.deal());
	System.out.println(p);
	for (int i=0;i<4;i++) p.giveVisible(d.deal());
	System.out.println(p);
    }
}
