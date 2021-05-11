import java.util.ArrayList;


public class CheckSummary {
    public static MyDate tempdate;
    public static int tempamt, ttamt;
    public static void printSummary(ArrayList<Check> checks) { 

    
        for(int i = 0; i < checks.size(); i++) {
            System.out.println(checks.get(i));
            if (i == checks.size() - 1) {
                int tmp;
                tmp = checks.get(i).check_num;
                tmp = tmp + 1;
                System.out.println("The next check number is " + tmp);
                
            }
        }
        
        System.out.println();

        ttamt = 0;
        tempamt = 0;
        tempdate = checks.get(0).date;
        for(Check i:checks) {
            if((i.date.getYear() == tempdate.getYear()) && (i.date.getMonth() == tempdate.getMonth())) {
                tempamt += i.amt;
                ttamt += i.amt;
            }
            else {
                System.out.println("The total amount of the checks issued in " + tempdate.getYear() + "/" + tempdate.getMonth() + " is " + tempamt);
                tempamt = i.amt;
                tempdate = i.date;
                ttamt += i.amt;
            }
        }
        System.out.println("The total amount of the checks issued in " + tempdate.getYear() + "/" + tempdate.getMonth() + " is " + tempamt);
        System.out.println("The total amount is " + ttamt);
    }
}
