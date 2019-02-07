import java.io.InputStream;
import java.util.List;

//credits to Vojtech Horky
//nejsem si jista, jestli to funguje
public class Graf {
    private static final int MAX_VYSKA_SLOUPCE = 60;
    private static final int SIRKA_SLOUPCE = 20;
    private static final int MEZERA = 5;
    public static void main(String args[]) {
        List<Integer> hodnoty = nactiVstup(System.in);
        int max = najdiMaximum(hodnoty);
        hodnoty = prenasob(hodnoty, (double) MAX_VYSKA_SLOUPCE / max);
        
        System.out.println("<?xml version=\"1.0\"?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        int sirkaObrazku = (SIRKA_SLOUPCE + MEZERA) * hodnoty.size() - MEZERA;
        int vyskaObrazku = MAX_VYSKA_SLOUPCE;
        System.out.println(String.format("width=\"%d\" height=\"%d\" viewBox=\"0 0 140 120\">", sirkaObrazku, vyskaObrazku));   
        System.out.println("</svg>");
        
        for (int i = 0; i < hodnoty.size(); i++) {
            System.out.printf("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"fill=\"blue\" stroke=\"black\" stroke-width=\"2\"/>", i * (SIRKA_SLOUPCE + MEZERA), MAX_VYSKA_SLOUPCE - hodnoty.get(i), SIRKA_SLOUPCE, hodnoty.get(i));
        }
    }

    private static List<Integer> prenasob(List<Integer> hodnoty, double cislo) {
        List<Integer> vysledek = new ArrayList<>();
        for (int h : hodnoty) {
            vysledek.add((int) Math.round(h * cislo));
        }
        return vysledek;
    }

    private static int najdiMaximum(List<Integer> hodnoty) {
        if (hodnoty.isEmpty()) {
            return 60;
        }
        int max = hodnoty.get(0);
        for (int i : hodnoty) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}