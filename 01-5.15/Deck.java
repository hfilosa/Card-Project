public class Deck{
    myStack<Card> Deck;
    //Deck is a stack for improved speed but can change to an array or list.
    int[] Values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    String[] Suits = {"Hearts","Spades","Clubs","Diamonds"};
    //For use in optionsAre()   
    public Card[] optionsAre(){
	Card[] Final = new Card[51];
	int place = 0;
	for(int i = 0; i < Values.length(); i++){
	    for(int j = 0; j < Suits.length(); j++){
		Card tmp = new Card(Values[i], Suits[j]);
		place++;
		Final[place] = tmp;
	    }
	}
    }
    public Deck(){

    }
}
