import java.util.ArrayList;
import java.util.Scanner;

/*Returning integers from the most times written, in paranthesis is number of repetition */
/*For next time better to use HashMap or HashTable!!!!!*/
public class CetnostCisel {  
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> numbersFromScanner = new ArrayList<Integer>();
        
        int position = 0;
        int maximum = 0; //it will be never used, but Java want it 
        while (sc.hasNextInt()) {
            if (position == 0) {
                maximum = sc.nextInt();
                numbersFromScanner.add(0, maximum);
            }
            else {
                numbersFromScanner.add(position, sc.nextInt());
            }
            
            if (numbersFromScanner.get(position) > maximum) {
                maximum = numbersFromScanner.get(position);
            }
            else if (numbersFromScanner.get(position) < -maximum) {
                maximum = -1 * numbersFromScanner.get(position);
            }
            
            position += 1;
        }
        //System.out.printf("Maximum is: %d \n", maximum);
        sc.close();

        /*creating Array full of 0 for following work with indexes*/
        int[] arrayOfNumbers = new int[maximum + 1];
        int[] arrayOfNegativeNumbers = new int[maximum + 1];
        for (int j = 0; j <= maximum; j++) {
            arrayOfNumbers[j] = 0;
            arrayOfNegativeNumbers[j] = 0;
        }

        /*counting*/
        for (int i = 0; i < numbersFromScanner.size(); i++) {
            int number2 = numbersFromScanner.get(i);
            if (number2 >= 0) {
                arrayOfNumbers[number2] += 1;
            }
            else {
                arrayOfNegativeNumbers[-number2] += 1;
            }
        }
        
        /*almost like BubbleSort - haha sure...*/
        for (int z = 0; z < 2; z++) {

            for (int h = 0; h < maximum; h++) {
                int maximum2 = arrayOfNumbers[0];
                int maxIndex = 0; //number

                for (int g = 0; g <= maximum; g++) {
                    if (arrayOfNumbers[g] > maximum2) {
                        maximum2 = arrayOfNumbers[g];
                        maxIndex = g;
                    }
                    else if (arrayOfNegativeNumbers[g] > maximum2) {
                        maximum2 = arrayOfNegativeNumbers[g];
                        maxIndex = -g;
                    }
                }
                if (maximum2 == 0) { //no more printing needed
                    break;
                }
                
                System.out.printf("%d(%d) ", maxIndex, maximum2); //number(how many times)
                if (maxIndex >= 0) {
                    arrayOfNumbers[maxIndex] = 0;
                }
                else {
                    arrayOfNegativeNumbers[-maxIndex] = 0;
                }
            }
        }
    }
}