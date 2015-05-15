public class Card implements Comparable<Card>{
    private int Value;
    private String Suit;
    private String Color;
    private String Name;
   
    public Card(int Value, String Suit, String Color, String Name){
	Value = this.Value;
	Suit = this.Suit;
	Color = this.Color;
	Name = this.Name;
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

    public int compareTo(Card c){
	return Value - c.getValue();
    }
}
