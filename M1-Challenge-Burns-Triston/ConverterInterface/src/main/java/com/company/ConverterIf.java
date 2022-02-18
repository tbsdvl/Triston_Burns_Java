package com.company;

import com.interfaces.Converter;

import java.io.IOException;

public class ConverterIf implements Converter {

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

        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Number exists outside valid range of numbers (1-12 only)");
        } else return this.months[monthNumber - 1];
    }

    public String convertDay(int dayNumber) {

        if (dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException("Number exists outside valid range of numbers (1-7 only)");
        } else return this.weekdays[dayNumber - 1];
    }

}

