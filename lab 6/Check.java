public class Check {
    public String name;
    public int check_num=0, amt;
    public MyDate date;

    static int check_count=1000;

    public Check(String name, int amt, MyDate date) {
        this.name = name;
        this.amt = amt;
        this.date = date;
        check_count ++;
        check_num = check_count;
    }

    public String toString() {
        return "Check No: " + check_num + ", Payee: " + name + ", Amount: " + amt + ", Date: " + date;
    }
}
