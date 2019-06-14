public class Date {
   private int day,mounth,year ;
    public Date(){

    }
    public Date(Date other){

    }
    public Date(int day,int mounth,int year){

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

    }

    public boolean equals(Date other) {
        boolean result = false;
        if (this.getDay()==other.getDay() &&  this.getMounth()== other.getMounth() && this.getYear() == other.getYear() ){
            result=true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + this.day +
                ", mounth=" + this.mounth +
                ", year=" + this.year +
                '}';
    }
}
