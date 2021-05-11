import java.util.ArrayList;

public class Account {

  private int balance;

  public Account(int initialBalance) {
    balance = initialBalance;
  }

  public void processCheck(Check check) throws NotEnoughFundException {
    NotEnoughFundException nef = new NotEnoughFundException();
    if (balance >= check.amt){
      balance = balance - check.amt;
    }
    else {
      throw nef;
    }
  }

  public void processTransaction(ArrayList<Check> checks) {
    System.out.println("The current balance is " + balance);
    System.out.println();
    int i = 0;
    int check_count = checks.size();
    while (i < check_count){
      System.out.println("Processing " + checks.get(i).toString());
      try{
        processCheck(checks.get(i));
        System.out.println("The current balance is " + balance);
        System.out.println();
        i++;
      }
      catch(NotEnoughFundException e){
        System.out.println("check cannot to be cleared due to not enough fund.");
        System.out.println("add 500 to the account...");
        balance += 500;
        System.out.println("The current balance is " + balance);
        System.out.println();
      }
    }
  }
}
