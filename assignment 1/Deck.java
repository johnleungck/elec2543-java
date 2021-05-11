import java.util.ArrayList;
public class Deck{

	private int round;
	public static ArrayList<Card> gamedeck = new ArrayList<Card>();
	public ArrayList<Card> oricard = new ArrayList<Card>();
	public Deck(int n){
	round = n;

    Suit[] suit_value = Suit.values();
    for (int i=3; i>= 0; i--){
      for (Rank j: Rank.values()){
        oricard.add(new Card(j, suit_value[i]));
      }
    }

		ArrayList<Card>sub1=new ArrayList<Card>();
		ArrayList<Card>sub2=new ArrayList<Card>();
		for(int i=0; i<52; i++) {
			if(i < 26){
				sub1.add(oricard.get(i));
			}
			else{
				sub2.add(oricard.get(i));
			}
		}

		if(round == 0){
			gamedeck = oricard;
		}
		else{
			for(int i=0; i<round; i++){
        gamedeck.clear();
				for(int j=0; j<52; j++){
          int k = j/2;
					if(j%2 == 0){
						gamedeck.add(sub1.get(k));
					}
					else{
						gamedeck.add(sub2.get(k));
					}
				}
        sub1.clear();
        sub2.clear();
				for(int j=0; j<52; j++){
					if(j < 26){
						sub1.add(gamedeck.get(j));
					}
					else{
						sub2.add(gamedeck.get(j));
					}
				}
			}
		}
  }

	public static Card drawCard(){
		Card pick = gamedeck.get(0);
		gamedeck.remove(0);
		return pick;
	}	
}