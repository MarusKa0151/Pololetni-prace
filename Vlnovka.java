public class Vlnovka {
    //TBD
    //zase ti to nefunguje!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        firstLine(number, 80);
        printingLines(number, 80, Integer.parseInt(args[0]) - 1);
        
    }
    public static void firstLine(int size, int width) {
            printingLines(size, width, 1);
    }

    public static void printingLines(int sizeOfWave, int widthOfScreen, int repetition) {
        /*which line*/
        boolean printingLowerSpaces = false;
        boolean printingUpperSpaces = false;
        boolean charDown = false;
        boolean charUp = false;
        
        if (repetition == 1) {
            charDown = true;
        }
        else {
            printingLowerSpaces = true;
        }

        /*number of spaces*/
        int upperSpaces = (sizeOfWave * 2) - 3;
        int lowerSpaces = 1;
        int j = 0;

        /*the printing of other lines in wave*/
        for (int i = 0; i < repetition; i++) {  

            /*one line*/
            while (j < widthOfScreen) {
                if (charDown == true && j < widthOfScreen) {
                    System.out.print("#");
                    charDown = false;
                    printingUpperSpaces = true;
                    j++;
                }
    
                if (printingUpperSpaces == true) {
                    for (int u = 0; u < upperSpaces; u++) {
                        if (j < widthOfScreen) {
                            System.out.print(" ");
                            j++;
                        }
                    }
                    printingUpperSpaces = false;
                    charUp = true;
                }
    
                if (charUp == true && j < widthOfScreen) {
                    System.out.print("#");
                    charUp = false;
                    if (repetition == 1) {
                        printingLowerSpaces = false;
                    }
                    else {
                        printingLowerSpaces = true;
                    }
                    j++;
                }
    
                if (printingLowerSpaces == true) {
                    for (int l = 0; l < lowerSpaces; l++) {
                        if (j < widthOfScreen) {
                            System.out.print(" ");
                            j++;
                        } 
                    }
                    printingLowerSpaces = false;
                    charDown = true;
                }

            }
            /*new line*/
            System.out.println();
            upperSpaces -= 2;
            lowerSpaces += 2;
            j = 0;
        }
    }
}