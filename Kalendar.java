import java.util.Calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kalendar {
    /*
    Calendar.MONTH is indexed from 0 = January, LocalDate from 1 = January
    Calendar.getInstance().get(Calendar.YEAR) = the current year
    Calendar.getInstance().get(Calendar.MONTH) = the current month
    */
        
    public static void main(String[] args) {
        if (args.length == 0) {
            int month = Calendar.getInstance().get(Calendar.MONTH);
            int year = Calendar.getInstance().get(Calendar.YEAR);
            threeCalendars(month, year);
        }
        
        else if (args.length == 1) {
            int month = Integer.parseInt(args[0]) - 1;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            threeCalendars(month, year);
        }

        else if (args.length == 2) {
            int month = Integer.parseInt(args[0]) - 1;
            int year = Integer.parseInt(args[1]);
            threeCalendars(month, year);
        }            
    }


    /*also print month before and after (but in column, not line) */
    public static void threeCalendars(int month, int year) {
        if (month == 0) {
            calendar(11, year - 1);
            calendar(month, year);
            calendar(month + 1, year);
        }

        else if (month == 11) {
            calendar(month - 1, year);
            calendar(month, year);
            calendar(0, year + 1);
        }

        else {
            calendar(month - 1, year);
            calendar(month, year);
            calendar(month + 1, year);
        }
    }


    public static void calendar(int month, int year) {
        String title = months(month) + " " + year;
        System.out.println("+----------------------+");
        System.out.printf("|%22s|\n", title);
        System.out.println("+----------------------+");
        System.out.println("| Po Ut St Ct Pa So Ne |");

        notStaticPart(getDayOfWeek(1, month, year), getdaysInMonth(month, year));

        System.out.println("+----------------------+");
    }


    public static String months(int month) {
        String monthsInLetters[] = {"leden", "unor", "brezen", "duben", "kveten", "cerven", "cervenec", "srpen", "zari", "rijen", "listopad", "prosinec"};
        return monthsInLetters[month]; 
    }


    public static void notStaticPart(int dayOfWeek, int daysInMonth) {
        int start = firstLine(dayOfWeek);
        int number = (daysInMonth - start + 1) / 7;
        for (int i = 0; i < number; i++) {
            System.out.printf("|%3d%3d%3d%3d%3d%3d%3d |\n", start, start + 1, start + 2, start + 3, start + 4, start + 5, start + 6);
            start += 7;
        }
        lastLine(start, daysInMonth);
    }


    public static int getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month + 1, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekIntValue = dayOfWeek.getValue(); //1 = monday
        return dayOfWeekIntValue;
    }


    public static boolean shorterOrLongerYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public static int getdaysInMonth(int month, int year) {
        int days[] = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 1) {
            if (shorterOrLongerYear(year)) {
                return 29;
            }
            else {
                return 28;
            }
        }
        else {
            return (days[month]);
        }
    }


    /*I do not like myself for this part of code*/
    public static int firstLine(int dayOfWeek) {
        System.out.print("|");
        int startWith = 0;
        if (dayOfWeek == 1) {
            System.out.printf("%3d%3d%3d%3d%3d%3d%3d |\n", 1, 2, 3, 4, 5, 6, 7);
            startWith = 8;
        }
        else if (dayOfWeek == 2) {
            System.out.printf("%6d%3d%3d%3d%3d%3d |\n", 1, 2, 3, 4, 5, 6);
            startWith = 7;
        }
        else if (dayOfWeek == 3) {
            System.out.printf("%9d%3d%3d%3d%3d |\n", 1, 2, 3, 4, 5);
            startWith = 6;
        }
        else if (dayOfWeek == 4) {
            System.out.printf("%12d%3d%3d%3d |\n", 1, 2, 3, 4);
            startWith = 5;
        }
        else if (dayOfWeek == 5) {
            System.out.printf("%15d%3d%3d |\n", 1, 2, 3);
            startWith = 4;
        }
        else if (dayOfWeek == 6) {
            System.out.printf("%18d%3d |\n", 1, 2);
            startWith = 3;
        }
        else if (dayOfWeek == 7) {
            System.out.printf("%21d |\n", 1);
            startWith = 2;
        }
        return startWith;
    }

    /*ssme with this part*/
    public static void lastLine(int start, int daysInMonth) {
        if (daysInMonth - start + 1 == 6) {
            System.out.printf("|%3d%3d%3d%3d%3d%3d%5s\n", start, start + 1, start + 2, start + 3, start + 4, start + 5, "|");
        }
        else if (daysInMonth - start + 1 == 5) {
            System.out.printf("|%3d%3d%3d%3d%3d%8s\n", start, start + 1, start + 2, start + 3, start + 4, "|");
        }
        else if (daysInMonth - start + 1 == 4) {
            System.out.printf("|%3d%3d%3d%3d%11s\n", start, start + 1, start + 2, start + 3, "|");
        }
        else if (daysInMonth - start + 1 == 3) {
            System.out.printf("|%3d%3d%3d%14s\n", start, start + 1, start + 2, "|");
        }
        else if (daysInMonth - start + 1 == 2) {
            System.out.printf("|%3d%3d%17s\n", start, start + 1, "|");
        }
        else if (daysInMonth - start + 1 == 1) {
            System.out.printf("|%3d%20s\n", start, "|");
        }
    }
}