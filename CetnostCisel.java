import java.util.ArrayList;
import java.util.Scanner;

/*Returning numbers from the most times written, in paranthesis is number of repetition */
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
            
            position += 1;
            numbersFromScanner.add(position, sc.nextInt());
            if (numbersFromScanner.get(position) > maximum) {
                maximum = numbersFromScanner.get(position);
            }
        }
        //System.out.printf("Maximum is: %d \n", maximum);

        /*creating Array full of 0 for following work with indexes*/
        int[] arrayOfNumbers = new int[maximum + 1];
        for (int j = 0; j <= maximum; j++) {
            arrayOfNumbers[j] = 0;
        }

        /*counting*/
        for (int i = 0; i < numbersFromScanner.size(); i++) {
            int number2 = numbersFromScanner.get(i);
            arrayOfNumbers[number2] += 1;
        }
        
        /*almost like BubbleSort - haha sure...*/
        for (int h = 0; h < maximum; h++) {
            int maximum2 = arrayOfNumbers[0];
            int maxIndex = 0; //number
            for (int g = 1; g <= maximum; g++) {
                if (arrayOfNumbers[g] > maximum2) {
                    maximum2 = arrayOfNumbers[g];
                    maxIndex = g;
                }
            }
            if (maximum2 == 0) { //no more printing needed
                break;
            }
            System.out.printf("%d(%d) ", maxIndex, maximum2); //number(how many times)
            arrayOfNumbers[maxIndex] = 0;
        }
    }
}