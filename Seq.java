public class Seq {
    /*printing sequences of numbers based on the input
    https://alej.alisma.cz/prog1/zp/seq.html */
    public static void main(String[] args) {
        String letterS = "-s";

        if (letterS.equals(args[0])) {
            special(args);
        }

        else {
            basic(args);
        }
    }


    public static void result(int start, int jump, int stop, String separator) {
        if (jump > 0) {

            for (int i = start; i <= stop; i += jump) {
                if (i == start) {
                    System.out.printf("%d", i);
                }
                else {
                    System.out.printf("%s%d", separator, i);
                }
            }
        }
        else {

            for (int i = start; i >= stop; i += jump) {
                if (i == start) {
                    System.out.printf("%d", i);
                }
                else {
                    System.out.printf("%s%d", separator, i);
                }
            }
        }
    }


    public static void basic(String[] arguments) {
        if (arguments.length == 1) {
            result(1, 1, Integer.parseInt(arguments[0]), " ");
        }

        else if (arguments.length == 2) {
            result(Integer.parseInt(arguments[0]), 1, Integer.parseInt(arguments[1]), " ");
        }

        else if (arguments.length == 3) {
            result(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]), " ");
        }

    }


    public static void special(String[] arguments) {
        if (arguments.length == 3) {
            result(1, 1, Integer.parseInt(arguments[2]), arguments[1]);
        }

        else if (arguments.length == 4) {
            result(Integer.parseInt(arguments[2]), 1, Integer.parseInt(arguments[3]), arguments[1]);
        }

        else if (arguments.length == 5) {
            result(Integer.parseInt(arguments[2]), Integer.parseInt(arguments[3]), Integer.parseInt(arguments[4]), arguments[1]);
        }

    }
 
}