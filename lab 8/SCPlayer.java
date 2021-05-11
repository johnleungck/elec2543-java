import java.util.ArrayList;

public class SCPlayer extends Player{

    public SCPlayer(String name){
        super(name);
      }
    
      public Card playCard() {
        ArrayList<Card> cList = new ArrayList<Card>();
        cList = getCList();
        Card play = cList.get(0);
        cList.remove(0);
        return play;
      }
}