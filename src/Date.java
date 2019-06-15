public class Date {
   private int day,mounth,year ;
    public Date(){
        this.setDay(0);
        this.setMounth(0);
        this.setYear(0);
    }
    public Date(Date other){
        this.setMounth(other.getMounth());
        this.setYear(other.getYear());
        this.setDay(other.getDay());
    }
    public Date(int day,int mounth,int year){
        this.setDay(day);
        this.setMounth(mounth);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        try {
            if (mounth==2){
                if (day<29 && day>-1){
                    this.mounth= mounth;
                }
                else
                    throw new  IllegalArgumentException();
            }
            else if(mounth==1 || mounth==3|| mounth == 5 || mounth == 7 ||mounth == 8||mounth == 10||mounth == 12 ){
                if (day<32 && day>-1){
                    this.mounth= mounth;
                }
                else
                    throw new  IllegalArgumentException();
            }
            else {
                if (day < 32 && day > -1) {
                    this.mounth = mounth;
                } else
                    throw new  IllegalArgumentException();
            }
        }catch (Exception e){
            e=null;
            System.out.println("illegal argument");
        }

    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        try {
            if (mounth<13 && mounth>-1){
                this.mounth= mounth;
            }
            else
                throw new  IllegalArgumentException();
        }catch (Exception e){
            e=null;
            System.out.println("illegal argument");
        }


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
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
        return "src.Date{" +
                "day=" + this.day +
                ", mounth=" + this.mounth +
                ", year=" + this.year +
                '}';
    }
}
