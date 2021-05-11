public class Card {
  private Suit suit; Rank rank;
  
  public Card (Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
  
  public String toString() {
    return suit.toString() + rank.toString();
  }
  
  public int compareTo (Card c) {
    if (this.rank.ordinal() > c.rank.ordinal()) {
      return 1;
    }
    else if (this.rank.ordinal() == c.rank.ordinal()) {
      if (this.suit.ordinal() < c.suit.ordinal()) {
        return 1;
      }
      else if (this.suit.ordinal() == c.suit.ordinal()) {
        return 0;
      }
      else return -1;
    }
    else return -1;
  }
  
}