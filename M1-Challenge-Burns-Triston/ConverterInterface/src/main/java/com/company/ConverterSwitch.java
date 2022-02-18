package com.company;

import com.interfaces.Converter;
import com.sun.javaws.IconUtil;

public class ConverterSwitch implements Converter {

    private static String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    private static String[] weekdays = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
    };

    public String convertMonth(int monthNumber) {
        String month = new String();

        if(monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Number must be between 1 and 12");
        }

        switch (monthNumber) {
            case 1:
                month = this.months[1 - 1];
                break;
            case 2:
                month = this.months[2 - 1];
                break;
            case 3:
                month = this.months[3 - 1];
                break;
            case 4:
                month = this.months[4 - 1];
                break;
            case 5:
                month = this.months[5 - 1];
                break;
            case 6:
                month = this.months[6 - 1];
                break;
            case 7:
                month = this.months[7 - 1];
                break;
            case 8:
                month = this.months[8 - 1];
                break;
            case 9:
                month = this.months[9 - 1];
                break;
            case 10:
                month = this.months[10 - 1];
                break;
            case 11:
                month = this.months[11 - 1];
                break;
            case 12:
                month = this.months[12 - 1];
                break;
        }

        return month;
    }

    public String convertDay(int dayNumber) {
        String day = new String();

        if(dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException("Number must be between 1 and 7");
        }

        switch (dayNumber) {
            case 1:
                day = this.weekdays[1 - 1];
                break;
            case 2:
                day = this.weekdays[2 - 1];
                break;
            case 3:
                day = this.weekdays[3 - 1];
                break;
            case 4:
                day = this.weekdays[4 - 1];
                break;
            case 5:
                day = this.weekdays[5 - 1];
                break;
            case 6:
                day = this.weekdays[6 - 1];
                break;
            case 7:
                day = this.weekdays[7 - 1];
                break;
        }

        return day;
    }
}