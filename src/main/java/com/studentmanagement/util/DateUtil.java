package com.studentmanagement.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    // Returns today's date in string format
    public static String getCurrentDate() {
        return sdf.format(new Date());
    }

    // Validate if date is in correct format
    public static boolean isValidDate(String dateStr) {
        try {
            sdf.setLenient(false);
            sdf.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Convert string to Date object
    public static Date toDate(String dateStr) {
        try {
            return sdf.parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }

    // Convert Date object to string
    public static String toString(Date date) {
        if (date == null) return null;
        return sdf.format(date);
    }
}
