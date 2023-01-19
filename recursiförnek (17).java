public class ornek19 {

    //kpog stringteki boşlukları silip stringi geri döndüren rekürsif fonk yazınız.

    public static void main(String[] args) {
        String kelime = "hasan yılmaz gürsoy";
        String x = boslukSilme(kelime, 0);
        System.out.println(x);

    }

    public static String boslukSilme(String kelime, int i) {

        if (i >= kelime.length()) {
            return "";
        }
        if (kelime.charAt(i) == ' ') {
            return boslukSilme(kelime, i + 1);
        } else return kelime.charAt(i) + boslukSilme(kelime, i + 1);

    }

}
