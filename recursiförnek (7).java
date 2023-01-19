public class ornek9 {
    public static void main(String[] args) {
        // Metodun çağrılması
        printIndexesOfChar("AnkaKuşua", 'a', 0);
    }

    // Rekürsif metod
    private static void printIndexesOfChar(String str, char c, int index) {
        // Eğer index değişkeni stringin uzunluğu ile eşitse, metod çalışması sonlanır
        if (index == str.length()) {
            return;
        }

        // Eğer str.charAt(index) ile bulunan karakter c karakterine eşitse, index değişkeni ekrana yazdırılır
        if (str.charAt(index) == c) {
            System.out.println(index);
        }

        // Metod kendi kendine çağrılır ve index değişkeni 1 arttırılarak yeniden çalıştırılır
        printIndexesOfChar(str, c, index + 1);
    }
}
