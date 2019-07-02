package com.GanNachum;

public class Date { 
    private int day, month, year ;
    public Date(){
        this.setDay(0);
        this.setMonth(0);
        this.setYear(0);
    }
    public Date(Date other){
        this.setMonth(other.getMonth());
        this.setYear(other.getYear());
        this.setDay(other.getDay());
    }
    public Date(int day,int Month,int year){
        this.setDay(day);
        this.setMonth(Month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day, int month, int year) {
        try {
            if (month==2){
                if (day<29 && day>=1){
                    this.day=day;
                }
                else
                    throw new  IllegalArgumentException();
            }
            else if(month==1 || month==3|| month == 5 || month == 7 ||month == 8||month == 10||month == 12 ){
                if (day<32 && day>-1){
                    this.month=month;
                }
                else
                    throw new  IllegalArgumentException();
            }
            else {
                if (day < 32 && day > -1) {
                    this.month = month;
                } else
                    throw new  IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("illegal argument");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int Month) {
        try {
            if (Month<13 && Month>-1){
                this.month= Month;
            }
            else
                throw new  IllegalArgumentException();
        }catch (Exception e){
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
        if (this.getDay()==other.getDay() &&  this.getMonth()== other.getMonth() && this.getYear() == other.getYear() ){
            result=true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "src.Date{" +
                "day=" + this.day +
                ", Month=" + this.month +
                ", year=" + this.year +
                '}';
    }
}
