import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kalendar {
    //tbd
    
    public static void main(String[] args) {
        if (args.length == 0) {
            calendar(Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));
        }
        
        else if (args.length == 1) {
            calendar(Integer.parseInt(args[0]) - 1, Calendar.getInstance().get(Calendar.YEAR));
        }

        else if (args.length == 2) {
            calendar(Integer.parseInt(args[0]) - 1, Integer.parseInt(args[1]));
        }            
    }

    public static void calendar(int month, int year) {
        String title = months(month) + " " + year;
        System.out.println("+----------------------+");
        System.out.printf("|%22s|\n", title);
        System.out.println("+----------------------+");
        System.out.println("| Po Ut St Ct Pa So Ne |");
        //notStaticPart(getDayOfWeek(1, month, year));
        System.out.println("+----------------------+");

    }

    public static String months(int month) {
        String monthsInLetters[] = {"leden", "unor", "brezen", "duben", "kveten", "cerven", "cervenec", "srpen", "zari", "rijen", "listopad", "prosinec"};
        return monthsInLetters[month]; 
    }

    public static void notStaticPart(int dayOfWeek) {
        
        /*
        tadyto dodelat!!!!!!!!!!!!!!!!!!!!!111
        */
    }

    public static int getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekIntValue = dayOfWeek.getValue();
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

    public static int daysInMonth(int month, int year) {
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

    
    
}