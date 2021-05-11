public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return suit.toString() + rank.toString();
    }

    public int compareTo(Card c) {
        /*
        if (card_rank.ordinal() * 10 + card_suit.ordinal() < c.card_rank.ordinal() * 10 + c.card_suit.ordinal()) {
            return -1;
        }
        else if (card_rank.ordinal() * 10 + card_suit.ordinal() > c.card_rank.ordinal() * 10 + c.card_suit.ordinal()) {
            return 1;
        }
        else if (card_rank.ordinal() * 10 + card_suit.ordinal() == c.card_rank.ordinal() * 10 + c.card_suit.ordinal()) {
            return 0;
        }
        return 0;
        */
        if (this.rank.ordinal() == c.rank.ordinal()) {
            if (this.suit.ordinal() < c.suit.ordinal()) {
                return -1;
            }
            else if (this.suit.ordinal() == c.suit.ordinal()) {
                return 0;
            }
            else return 1;
        }
        else if (this.rank.ordinal() < c.rank.ordinal()) {
            return -1;
        }
        else return 1;
    }
}