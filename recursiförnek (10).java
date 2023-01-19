public class ornek12 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen stringteki küçük karakterleri geri döndüren rekürsif fonk. yazınız

        String kelime = "hasAN";
        String x = kucukleriBulma(kelime, 0);
        System.out.println(x);

    }

    public static String kucukleriBulma(String kelime, int indis) {
        if (indis == kelime.length()) {
            return "";

        } else if (kelime.charAt(indis) >= 'a' && kelime.charAt(indis) <= 'z') {
            return kelime.charAt(indis) + kucukleriBulma(kelime, indis + 1);
        } else
            return kucukleriBulma(kelime, indis + 1);

    }
}