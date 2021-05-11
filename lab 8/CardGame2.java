public class CardGame2 {

  private Player[] players;	// players in this game

  // constructor
  public CardGame2(Player[] players) {
    this.players = players;
  }

  public void play() {
    for (int i=0; i<players.length; i++){
      for (Player j : players){
        j.printHand();
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
    for (Player i : players){
      i.printHand();
    }
    Card[] card_comp = new Card[players.length];
    for (int i=0; i<players.length; i++){
      Card play_card = players[i].playCard();
      System.out.println(players[i].getName() + " plays " + play_card);
      card_comp[i] = play_card;
    }
      
    int winner_index = 0;
    for (int i=0; i<players.length-1; i++){
      if (card_comp[i+1].compareTo(card_comp[winner_index]) == 1){
        winner_index = i+1;
      }
    }
    System.out.println("The winner of this round is " + players[winner_index].getName() + ".");
  }
}