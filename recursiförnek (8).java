public class ornek10 {
    // kendisine parametre olarak gelen stringteki küçük karakteri büyük
    // ,büyük karaketri küçük yapan rekürsif fonksiyon
    public static void main(String[] args) {
        String s = "hasAN";
        String x = kucukbuyuk(s, 0);
        System.out.println(x);
    }

    public static String kucukbuyuk(String str, int ind) {
        if (ind == str.length()) {
            return "";
        } else if (str.charAt(ind) >= 'a' && str.charAt(ind) <= 'z') {
            return (char) (str.charAt(ind) - 32) + kucukbuyuk(str, ind + 1);

        } else if (str.charAt(ind) >= 'A' && str.charAt(ind) <= 'Z') {
            return (char) (str.charAt(ind) + 32) + kucukbuyuk(str, ind + 1);

        } else
            return kucukbuyuk(str, ind + 1);
    }
}


