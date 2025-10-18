package org.jf.uni.week3;

public class Day {
    private int day;
    private int month;
    private int year;

    public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Day{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public boolean newYear() {
        return (day == 1) && (month == 1);
    }

    public boolean isCentury() {
        return (year % 100 == 0);
    }

    public boolean leapYear(){
        if (this.isCentury()){
            return(year % 400 ==0);
        }
        else{
            return (year % 4 == 0);
        }

    }

    public String dayOfWeek(){
        String result = "unknown";

        int century = year / 100;
        int centuryItem = (3 -(century% 4)) * 2;
        System.out.println(centuryItem);

        int yearPart = (year % 100);
        int x = yearPart / 12;
        int y = yearPart % 12;
        int z = y / 4;
        int yearItem = x + y + z;
        System.out.println(yearItem);

        int[] monthScore = {0,3,3,6,1,4,6,2,5,0,3,5};
        int monthItem = monthScore[month-1];
        System.out.println(monthItem);

        int dayItem = day;

        if ((this.leapYear()) && (month == 1 || month == 2)){
            dayItem = day + 6;
            System.out.println(dayItem);
        }

        int total = (centuryItem + yearItem + monthItem + dayItem) % 7;
        System.out.println(total);

         switch (total){
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
        }
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        result = week[total];

        return result;
    }

    public static void main(String[] args) {
        Day day = new Day(2, 3, 2017);
        System.out.println(day);

        day.setDay(31);
        day.setMonth(5);
        day.setYear(1900);

        System.out.println(day.getDay());
        System.out.println(day.getMonth());
        System.out.println(day.getYear());

        System.out.println(day);

        System.out.println(day.newYear());

        System.out.println(day.isCentury());

        System.out.println(day.leapYear());

        System.out.println(day.dayOfWeek());

    }
}