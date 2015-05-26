import java.util.ArrayList;
import java.util.Scanner;


public class Blackjack{
    private Deck Deck;
    private ArrayList<Player> Players;
    private static Scanner sc = new Scanner(System.in);
    private static final String Clear = "\u001b[2J\u001b[H";
    private int numPlayers;

    public Blackjack(){
	Deck = new Deck();
	Players = new ArrayList<Player>();
    }

    private void Display(player){
	for (Player p : Players){
	    if (p!=player) System.out.println(p.displayVisible());
	}
    }

    public void Turn(Player){
	System.out.prinln(Clear);
	System.out.println("It is your turn "+Player.getName());
	System.out.println(Player);
	Display;


    public void createPlayers(){
	System.out.println("Welcome to Blackjack");
	System.out.println("How many players are playing?");
	numPlayers=sc.nextInt();
	String playerName="";
	for (int i=1;i<=numPlayers;++i){
	    System.out.println("What is player "+i+" called?");
	    playerName=sc.nextLine();
	    Players.add(new Player(playerName));
	}
    }


    public static void main(String[] args){
        Blackjack b = new Blackjack();
	b.createPlayers();
    }

}
