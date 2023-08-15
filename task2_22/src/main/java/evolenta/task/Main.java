package evolenta.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату дд.мм.гггг");
        Scanner in = new Scanner(System.in);
        String dataString1 = in.nextLine();
        laterDays(dataString1, 45);
        firstDayYear(dataString1);
        laterWorkDay(dataString1, 10);
        System.out.println("Введите дату дд.мм.гггг");
        String dataString2 = in.nextLine();
        counterWorkDays(dataString1, dataString2);

    }

    public static void laterDays(String dateStr, int days) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(dateStr);
            Calendar calendarDate = Calendar.getInstance();
            calendarDate.setTime(date);
            calendarDate.add(Calendar.DATE, days);
            Date newDate = calendarDate.getTime();
            System.out.println("Плюс " + days + " дней " + format.format(newDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void firstDayYear(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(dateStr);
            Calendar calendarDate = Calendar.getInstance();
            calendarDate.setTime(date);
            calendarDate.set(Calendar.DAY_OF_YEAR, 1);
            Date newYearDate = calendarDate.getTime();
            System.out.println("Первый день года " + format.format(newYearDate));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void laterWorkDay(String dateStr, int days) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(dateStr);
            Calendar calendarDate = Calendar.getInstance();
            calendarDate.setTime(date);
            System.out.print("Спустя " + days + " рабочих дней ");
            while (days > 0) {
                if ((calendarDate.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) && (calendarDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)) {
                    days--;
                }
                calendarDate.add(Calendar.DATE, 1);
                date = calendarDate.getTime();
                format.format(date);
            }
            System.out.println(format.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void counterWorkDays(String dateStr1, String dateStr2) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date1 = format.parse(dateStr1);
            Calendar calendarDate1 = Calendar.getInstance();
            calendarDate1.setTime(date1);
            Date date2 = format.parse(dateStr2);
            Calendar calendarDate2 = Calendar.getInstance();
            calendarDate2.setTime(date2);
            int workDays = 0;
            while (date1.getTime() != date2.getTime()) {
                if ((calendarDate1.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) && (calendarDate1.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)) {
                    workDays++;
                }
                calendarDate1.add(Calendar.DATE, 1);
                date1 = calendarDate1.getTime();
                format.format(date1);
            }
            System.out.println("Рабочие дни " + workDays);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}