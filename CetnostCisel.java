import java.util.ArrayList;
import java.util.Scanner;

public class CetnostCisel { //MISTAKE? WHY????
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Integer> numbersFromScanner = new ArrayList<Integer>();
        int position = 0;
        int number1 = sc.nextInt();
        numbersFromScanner.add(number1);
        int maximum = numbersFromScanner.get(position);
        
        position += 1;
        while (sc.hasNextInt()) {
            numbersFromScanner.add(sc.nextInt());
            if (numbersFromScanner.get(position) > maximum) {
                maximum = numbersFromScanner.get(position);
            }
        }

        //creating Array full of 0 for following work with indexes
        int[] arrayOfNumbers = new int[maximum];
        for (int j = 0; j < maximum; j++) {
            arrayOfNumbers[j] = 0;
        }

        //counting
        for (int i = 0; i < numbersFromScanner.size(); i++) {
            int number2 = numbersFromScanner.get(i);
            arrayOfNumbers[number2] += 1;
        }

        //almost like BubbleSort
        for (int h = 0; h < maximum; h++) {
            int maximum2 = arrayOfNumbers[0];
            int maxIndex = 0;
            for (int g = 1; g <= maximum; g++) {
                if (arrayOfNumbers[g] > maximum2) {
                    maximum2 = arrayOfNumbers[g];
                    maxIndex = g;
                }
                if (maximum2 == 0) {
                    break;
                }
                System.out.printf("%d (%d)", maxIndex, maximum2);
            }
        }
    }
}