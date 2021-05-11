public enum Suit {
    DIAMOND("D"),
    CLUB("C"),
    HEART("H"),
    SPADE("S");

    private String suit;

    Suit (String s) {
      suit = s;
    }

    public String toString() {
      return suit;
  }
}