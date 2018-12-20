public class Kalendar {
    //tbd
    /*
    Date date = new Date(); date.toString() -> current date
    SimpleDateFormat sdf = new SimpleDateFormat(hh:mm:ss a dd-MMM-yyyy); sdf.format(date) -> another date format
     */
    public static void main(String[] args) {
        if (args.length == 0) {

        }
        
        else if (args.length == 1) {

        }

        else if (args.length == 2) {
            calendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }

    }

    public static void calendar(int month, int year) {



        System.out.println("+----------------------+");
        //System.out.println("|%22s|", name);
        System.out.println("+----------------------+");
        System.out.println("| Po Ut St Ct Pa So Ne |");
        /*
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %2d %2d %2d %2d %2d %2d %2d |\n");
        }
        */
        System.out.println("+----------------------+");

    }
}