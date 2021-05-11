// a class for representing dates
public class MyDate implements Comparable<MyDate> {
  private int year, month, day;

  // constructor
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() { return year; }

  public int getMonth() { return month; }

  public int getDay() { return day; }

  // print out date in the form of DD/MM/YYYY
  // no preceding zero for DD and MM
  public String toString() {
    return day + "/" + month + "/" + year;
  }

  public int compareTo(MyDate other){
    MyDate otherdate = (MyDate) other;
    int thisdatevalue = year*10000 + month*100 + day;
    int otherdatevalue = otherdate.year*10000 + otherdate.month*100 + otherdate.day;

    if (thisdatevalue > otherdatevalue){
      return 1;
    }
    if (thisdatevalue < otherdatevalue){
      return -1;
    }
    return 0;
  }
}
