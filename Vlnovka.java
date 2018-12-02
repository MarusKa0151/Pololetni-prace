public class Vlnovka {
    public static void main(String[] args) {
        int size = Int.parseInt(args[0]);
        int widthOfScreen = 80;
        int upperSpaces = (size * 2) - 3;
        int lowerSpaces = 1;

        /*printing lines*/
        for (int i = 0; i < size; i++) {
            j = 0;
            if (i == 0) {
                boolean printingLowerSpaces = false;
                boolean printingUpperSpaces = false;
                boolean charU = true;
                boolean charL = false;
            }
            else {
                boolean printingLowerSpaces = true;
                boolean printingUpperSpaces = false;
                boolean charL = false;
                boolean charU = false;
            }
            /*printing chars*/ //NEFUNGUJE TI TA TEORIE, OPRAV TO!!!
            while (j < widthOfScreen) {

                if (printingLowerSpaces == true) {
                    for (int l = 0; l < lowerSpaces; l++) {
                        System.out.print(" ");
                        lowerSpaces += 2;
                    }
                    printingLowerSpaces = false;
                    charU = true;
                }

                else if (printingUpperSpaces == true) {
                    for (int u = 0; u < upperSpaces; u++) {
                        System.out.print(" ");
                        upperSpaces -= 2;
                    }
                    printingUpperSpaces = false;
                    charL = true;
                }
                


            }

            System.out.println();
        }
        
    }
}