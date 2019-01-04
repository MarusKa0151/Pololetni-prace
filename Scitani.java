public class Scitani {
    /*generates 10 random addition examples, result under 20*/
    public static void main(String[] args) {
        examples(10);
    }

    public static void examples(int howMany) {
        for (int i = 0; i < 10; i++) {
            oneExample(20);
        }
    }
    
    public static void oneExample(int maxResult) {
        java.util.Random randomNumber = new java.util.Random();
        int first = randomNumber.nextInt(maxResult);
        int second = randomNumber.nextInt(maxResult - first);
        System.out.printf("%d + %d = \n", first, second);
    }
}