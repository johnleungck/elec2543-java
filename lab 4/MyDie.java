public class MyDie { 

  // PUT IN APPROPRIATE VISIBILITY MODIFIERS
  int min;	 // minimum face value
  int max;	 // maximum face value
  int faceValue; // current face value of the die
  MyRandom rnd;  // random number generator

  // use rnd to generate a face value in range [min, max]
  private int genFaceValue() {
    return rnd.nextInt(max);
  }

  // YOU SHOULD NOT MODIFY THIS METHOD 
  public MyDie(int min, int max) {
    this.min = min;
    this.max = max;
    rnd = new MyRandom();
    faceValue = genFaceValue();	// initialize the face value
  }

  // YOU SHOULD NOT MODIFY THIS METHOD EXCEPT 
  // PUTTING IN APPROPRIATE VISIBILITY MODIFIER
  public int roll() {
    faceValue = genFaceValue();
    return faceValue;
  }
}
