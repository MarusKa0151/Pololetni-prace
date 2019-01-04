public class Odmocnina {
    /*input should be: theNumber howAccurate
    howAccurate means how big could be a mistake*/
   
    public static void main(String[] args) {
        double theNumber = Double.parseDouble(args[0]);
        double howAccurate = Double.parseDouble(args[1]);
        System.out.printf("%.10f", cubeRoot(theNumber, howAccurate));
    }

    public static double cubeRoot(double number, double accuracy) {
        double lastSolution = 1;
        double newSolution = 2 + accuracy;

        while (Math.abs(newSolution - lastSolution) >= accuracy) {
            lastSolution = newSolution;
            /*https://en.wikipedia.org/wiki/Cube_root*/
            newSolution = (1.0 / 3.0) * (number / (lastSolution * lastSolution) + 2 * lastSolution);
        }
        return newSolution;
    }
}