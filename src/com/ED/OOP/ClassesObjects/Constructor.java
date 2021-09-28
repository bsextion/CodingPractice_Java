package com.ED.OOP.ClassesObjects;

class Date{
    private int day;
    private int month;
    private int year;
    private String event;

    public Date(){
        this.day = 1;
        this.month = 10;
        this.year  = 2000;
    }

    public Date(int month, int day, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month, int year, String event){
        this(day, month, year); // calling the constructor
        this.event = event;
    }

    public void printDate(){
        System.out.println(month + "/" + day + "/" + year);
    }
}

class Demo3 {
    public static void main(String[] args) {
        Date date = new Date(5, 11, 2004);
        date.printDate();
    }
}
