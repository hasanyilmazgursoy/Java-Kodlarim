public class ornek22 {
    public static void main(String[] args) {
        //kpog iki tane stringteki aynı indisteki aynı karakterleri geri döndüren rekürsif fonk yazınız

        String a = "hasan";
        String b = "hattn";

        String c = aynilaridonduren(a, b, 0);
        System.out.println(c);

    }

    public static String aynilaridonduren(String a, String b, int i) {
        if (i == a.length()) {
            return "";
        }
        if (a.charAt(i) == b.charAt(i)) {
            return a.charAt(i) + aynilaridonduren(a, b, i + 1);
        } else return aynilaridonduren(a, b, i + 1);
    }
}
