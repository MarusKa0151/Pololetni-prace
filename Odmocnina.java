public class Odmocnina {
    /*input should be: theNumber howMuchAccurate
    howMuchAccurate means how many times run the operation - the more it does, it'll be more accurate, but it takes more time
    howMuchAccurate = 30 works perfectly for numbers < 1 000 000*/
    public static void main(String[] args) {
        double theNumber = Double.parseDouble(args[0]);
        int howMuchAccurate = Integer.parseInt(args[1]);
        System.out.printf("%f", cubeRoot(theNumber, howMuchAccurate));
    }

    public static double cubeRoot(double number, int accuracy) {
        if (accuracy == 0) {
            double firstSolution = (1.0 / 3.0) * ((1.0 + 2.0 * number * number) / number);
            return(firstSolution);
        }
        else {
            double n = cubeRoot(number, accuracy - 1);
            return((1.0 / 3.0) * ((number / (n * n)) + 2.0 * n));
        }
    } 
}