public class Elipsa { //do not work, why?
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        draw(a, b);
    }

    public static void draw(double a, double b) {
        for (double x = -a; x <= a; x++) {

            for (double y = b; y >= -b; y--) {

                if (inEllipse(x, y, a, b)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
        
    //checking if point is in the ellipse
    public static boolean inEllipse(double x, double y, double a, double b) {
        return (x * x + y * y) <= (((x / a)*(x / a)) + ((y / b)*(y / b)));
    }
}