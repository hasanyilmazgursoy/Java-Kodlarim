public class ornek17 {
    public static void main(String[] args) {
        //Bir stringdeki küçük a ların kaçıncı indiste olduklarını ekrana yazan rekürsif metodu oluşturun.

        kucukAİndisbulma("Merhaba dünya!", 'a', 0);

    }

    public static void kucukAİndisbulma(String str, char c, int index) {
        if (index >= str.length()) {
            return;
        }
        if (str.charAt(index) == c) {
            System.out.println("Karakter '" + c + "' indeks " + index + "te bulundu.");
        }
        kucukAİndisbulma(str, c, index + 1);
    }
}