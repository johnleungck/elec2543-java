public class CardGame {

  // YOU CANNOT DEFINE OTHER INSTANCE VARIABLES
  private Player[] players;	// players in this game
  private int numRounds;	// number of rounds in this game
  private Deck deck;		// deck of cards

  // constructor
  // YOU SHOULD NOT MODIFY THIS METHOD
  public CardGame(Player[] players) {
    
    this.players = players;
    deck = new Deck(5);

  }

  // implement this method
  public void play() {

    // find out the number of rounds in this game
    numRounds = 52 / players.length;

    // distribute cards among players
    for (int i=0; i<numRounds; i++){
      for (int j=0; j<players.length; j++){
        players[j].addCard(Deck.drawCard());
      }
    }


    // develop the loop for each round
    // (1) print out the cards each player has
    // (2) print out the cards each player plays
    // (3) identify the winner of this round
    for (int i=0; i<numRounds; i++){
      for (int j=0; j<players.length; j++){
        players[j].printHand();
      }
      
      Card[] card_comp = new Card[players.length];
      for (int j=0; j<players.length; j++){
        Card play_card = players[j].playCard();
        System.out.println(players[j].getName() + " plays " + play_card);
        card_comp[j] = play_card;
      }
      
      int winner_index = 0;
      for (int j=0; j<players.length-1; j++){
        if (card_comp[j+1].compareTo(card_comp[winner_index]) == 1){
          winner_index = j+1;
        }
      }

      System.out.println("The winner of this round is " + players[winner_index].getName() + ".");
      System.out.println();
    }
  }
}
