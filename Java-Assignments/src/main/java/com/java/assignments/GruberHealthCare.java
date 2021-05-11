package com.java.assignments;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.util.Calendar.YEAR;

public class GruberHealthCare{

    private static Date registrationDate = null;
    private static Date currentDate = null;
    private static final Calendar registrationDateInCalendar = Calendar.getInstance();
    private static final Calendar currentDateInCalendar = Calendar.getInstance();

    private static void convertStringDateToDate(String dates) {
        String[] datesInput = dates.split(" ");

        try {
            registrationDate = new SimpleDateFormat("dd-MM-yyyy").parse(datesInput[0]);
            currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(datesInput[1]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static boolean isRegistrationDateMoreThanAYear(int daysSinceRegistration) {
        return daysSinceRegistration > 335;
    }

    private static int getDifferenceBetweenDatesInDays() {
        long timeSinceRegistration = currentDate.getTime() - registrationDate.getTime();
        int daysSinceRegistration = (int) (timeSinceRegistration/ (1000 * 60 * 60 * 24));

        return daysSinceRegistration;
    }

    private static void printRangeInThirtyPlusMinusDays() {
    	registrationDateInCalendar.setTime(registrationDate);
        currentDateInCalendar.setTime(currentDate);
        setRegistrationDateYearToCurrentYear();
        printRangeInGivenFormat();
    }

    private static void setRegistrationDateYearToCurrentYear() {
        int currentYear = currentDateInCalendar.get(YEAR);
        registrationDateInCalendar.set(YEAR, currentYear);
    }

    private static void printRangeInGivenFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        registrationDateInCalendar.add(Calendar.DATE, -30);
        System.out.println();
        System.out.print(sdf.format(registrationDateInCalendar.getTime()));
        registrationDateInCalendar.add(Calendar.DATE, 60);
        if(isCurrentDateBeforeRegistrationEndDate())
            System.out.println("  " + sdf.format(currentDateInCalendar.getTime()));
        else
            System.out.println("  " + sdf.format(registrationDateInCalendar.getTime()));
    }

    private static boolean isCurrentDateBeforeRegistrationEndDate() {
        return currentDateInCalendar.before(registrationDateInCalendar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String input_nextline = scanner.nextLine();

        for(int i = 0; i < testCases; i++) {
            String dates = scanner.nextLine();
            convertStringDateToDate(dates);

            if(isRegistrationDateMoreThanAYear(getDifferenceBetweenDatesInDays()))
                printRangeInThirtyPlusMinusDays();
            else
                System.out.println("No Range");
        }
    }
}
