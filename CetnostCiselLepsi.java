import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*Returning integers from the most times written, in paranthesis is number of repetition
now hash map*/
public class CetnostCiselLepsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        while (sc.hasNextInt()) {

            int number = sc.nextInt();
            if (map.containsKey(number)) {
                int repetition = map.get(number);
                map.replace(number, repetition + 1);
            }
            else {
                map.put(number, 1);
            }
        }
        sc.close();

        for (int a : map.keySet()) {
            System.out.printf("%d(%d) ", a, map.get(a));
        }
        
    }
}