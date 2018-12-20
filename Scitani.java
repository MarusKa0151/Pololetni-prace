public class Scitani {
    /*generates 10 random addition examples, result under 20*/
    public static void main(String[] args) {
        Examples(10);
    }

    public static void Examples(int howMany) {
        for (int i = 0; i < 10; i++) {
            oneExample(20);
        }
    }
    
    public static void oneExample(int maxResult) {
        java.util.Random randomNumber = new java.util.Random();
        int first = randomNumber.nextInt(maxResult);
        int second = randomNumber.nextInt(maxResult);
        if ((first + second) < maxResult) {
            System.out.printf("%d + %d = \n", first, second); 
        }  
        else {
            oneExample(maxResult);
        }
    }
}