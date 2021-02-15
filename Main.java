package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(2,1600));
    }
    public static boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999){
            return false;
        } else if(year % 4 != 0){
            return false;
        } else if(year % 100 != 0){
            return true;
        } else if(year % 400 != 0){
            return false;
        }
        return true;
    }

    public static int getDaysInMonth(int month, int year){
        int days = 0;
        boolean isItALeapYear = isLeapYear(year);
        if(year <= 1 || year >= 9999){
            return -1;
        }
        if(month <1 || month > 12){
            return -1;
        }

        switch(month) {
            case 1: //January always has 31 days
                  return 31;
            case 2: //February has 29 days if it is a leap year
                if(isItALeapYear){
                    return 29;
                }
                return 28;
            case 3: //March always has 31 days
                return 31;
            case 4: //April always has 30 days
                return 30;
            case 5: //May always has 31 days
                return 31;
            case 6: //June always has 30 days
                return 30;
            case 7: //July always has 31 days
                return 31;
            case 8: //August always has 31 days
                return 31;
            case 9: //September always has 30 days
                return 30;
            case 10: //October always has 31 days
                return 31;
            case 11: //November always has 30 days
                return 30;
            case 12: //December always has 31 days
                return 31;
        }

        return days;
    }
}

