public class Pi {
    public static void main(String[] args) {
        int numberOfShots = 10000000; //the bigger, the more accurate and slower
        calculatingPi(numberOfShots); 
    }
        
    public static boolean inCircle(double x, double y) {
        /*square has side long 1, circle radius is 0.5
        Math.pow(base, exponent) returns (double, not int) value base^exponent */
        return(Math.pow(0.5, 2) >= (Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2)));
    }

    public static void calculatingPi(int shots) {
        double shotsInCircle = 0.0;
        for (int i = 0; i < shots; i++) {
            /*Math.random() returns value from 0.0 to 1.0 */
            if (inCircle(Math.random(), Math.random())) {
                shotsInCircle += 1.0;
            }
            else {
                continue;
            }
        }
        /*pi = circle/(r^2), (r^2) = square/4 ... so ... pi = (4*circle)/square */
        double pi = (4 * shotsInCircle) / shots;
        System.out.printf("%f", pi);
    }
    
}