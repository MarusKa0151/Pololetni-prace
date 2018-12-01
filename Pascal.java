public class Pascal {
    //making the Pascal's triangle
    public static void main(String[] args) {
        int numberOfLines = Integer.parseInt(args[0]);
        printPascal(numberOfLines);
    }
        
    private static void printPascal(int lines) {
        long[][] PascalTriangle = new long[lines][lines];
        PascalTriangle[0][0] = 0;
        int numberOfSpaces = countingSpaces(lines);

        //new line
        for (int line = 0; line < lines; line++) {

            //spaces before
            for (int j = 0; j < ((lines - line - 1) * (numberOfSpaces)); j++) {
               System.out.print(" ");
            }

            //new number
            for (int rank = 0; rank <= line; rank++) {
                if ((rank == 0) || (line == 0)) {
                    PascalTriangle[line][rank] = 1;
                }
                else { 
                    //using the upper numbers
                    PascalTriangle[line][rank] = PascalTriangle[line - 1][rank - 1] + PascalTriangle[line - 1][rank];
                }
                if (rank != 0) {
                    //for nicer triangle
                    for (int i = 0; i < ((2 * numberOfSpaces) - (Long.toString(PascalTriangle[line][rank])).length()); i++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(PascalTriangle[line][rank]);

                
            }
            System.out.println("");
        }
    }

    //spaces, because we want to have nice triangle
    private static int countingSpaces(int n) {
        double theBiggest = Math.pow(n, n) / 2;
        int theBiggestOne = (int) theBiggest;
        int spaces2 = (Integer.toString(theBiggestOne)).length();
        return (spaces2);
    }
}