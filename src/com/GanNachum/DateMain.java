package com.GanNachum;

public class DateMain {
    public static  void main(String[] args){
        Date date2= new Date();
        Date date4= new Date(date2);
        Date date3= new Date(13,7,2019);
        if(date2.equals(date4)){
            System.out.println("equals");
        }
        System.out.println(date3.toString());
    }
}
