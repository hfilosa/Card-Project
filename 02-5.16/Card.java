public class Card implements Comparable<Card>{
    private int Value;
    private String Suit;
    private String Color;
    private String Name;
   
    public Card(int Value, String Suit, String Color, String Name){
	this.Value = Value;
	this.Suit = Suit;
	this.Color = Color;
	this.Name = Name;
    }

    public int getValue(){	
	return Value;
    } 

    public String getSuit(){
	return Suit;
    }

    public String getColor(){
	return Color;
    }

    public String getName(){
	return Name;
    }

    public String readCard(){
	return " "+ Value + " of " + Suit;
    }

    public String toString(){
	return ""+Name+" of "+Suit;
    }

    public int compareTo(Card c){
	return Value - c.getValue();
    }
}
