import java.util.ArrayList;

public class LCPlayer extends Player {

  public LCPlayer(String name){
    super(name);
  }

  public Card playCard() {
    ArrayList<Card> cList = new ArrayList<Card>();
    cList = getCList();
    Card play = cList.get(cList.size()-1);
    cList.remove(cList.size()-1);
    return play;
  }
}