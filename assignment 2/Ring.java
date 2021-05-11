public class Ring {

  // DO NOT CHANGE THE FOLLOWING
  private class RingNode {
    Object obj;
    RingNode next;
 
    RingNode(Object j) {
      obj = j;
      next = null;  
    }
  }

  private RingNode head;
  private RingNode curr;

  public Ring() {
    head = curr = null;
  }
  
  // print out the content of the ring
  // starting from the head node
  public String toString() {
    String s = "";

    RingNode curr = head;
    if (curr == null) return s;

    s += curr.obj.toString();
    while (curr.next != head) {
      curr = curr.next;
      s += ", " + curr.obj.toString();
    }

    return s;
  }
  ////////////////////////////////////////

  // PUT YOUR CODES BELOW HERE
  public void addObj(Object obj){
    RingNode newobj = new RingNode(obj);
    if (head != null) {
      newobj.next = head.next;
      head.next = newobj;
    }
    else{
      head = newobj;
      head.next = head;
      curr = head;
    }
  }

  public int size(){
    if (head == null){
      return 0;
    }
    RingNode temp = head.next;
    int count = 1;
    while (temp != head){
      count++;
      temp = temp.next;
    }
    return count;
  }

  public Object getCurrObj(){
    return curr.obj;
  }

  public void removeCurrObj(){
    RingNode temp = head;
    if (head == null){
      return;
    }
    if (head != curr){
      while (curr != temp.next){
        temp = temp.next;
      }
      temp.next = curr.next;
      curr = curr.next;
    }
    else{
      if  (head.next != head){
        while (temp.next != head){
          temp = temp.next;
        }
        temp.next = curr.next;
        curr = curr.next;
        head = curr;
      }
      else {
        head = null;
      }
    }
  }

  public void advance(){
    curr = curr.next;
  }
}