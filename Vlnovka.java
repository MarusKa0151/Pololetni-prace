public class Vlnovka {
    //TBD
    public static void main(String[] args) {
        int sizeOfWave = Int.parseInt(args[0]);
        int widthOfScreen = 80;
        int upperSpaces = (size * 2) - 3;
        int lowerSpaces = 1;

        /*first line*/
        if (size != 0) {
            boolean printingLowerSpaces = false;
            boolean printingUpperSpaces = false;
            boolean charDown = true;
            boolean charUp = false;

            
        }


        /*printing lines*/
    for (int i = 1; i < sizeOfWave; i++) {  
        int j = 0;
        while (j < widthOfScreen) {

            if (charDown = true && j < widthOfScreen) {
                System.out.print("#");
                charDown = false;
                printingUpperSpaces = true;
                j++;
            }

            if (printingUpperSpaces = true) {
                for (int u = 0; u < upperSpaces; u++) {
                    if (j < widthOfScreen) {
                        System.out.print(" ");
                        j++;
                    }
                }
                printingUpperSpaces = false;
                charUp = true;
                upperSpaces -= 2;
            }

            if (charUp = true && j < widthOfScreen) {
                System.out.print("#");
                charUp = false;
                printingLowerSpaces = true;
                j++;
            }

            if (printingLowerSpaces = true) {
                for (int l = 0; l < lowerSpaces; l++) {
                    if (j < widthOfScreen) {
                        System.out.print(" ");
                        j++;
                    } 
                }
                printingLowerSpaces = false;
                charDown = true;
                lowerSpaces += 2;
            }
            
        }
            System.out.println();
        }
        
    }
}