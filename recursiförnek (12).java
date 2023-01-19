public class ornek14 {
    //kendisine parametre olarak gelen stringi ters çevirip geri döndüren rekürsif fonk
    public static void main(String[] args) {
        String x = "hASAn";
        String a = terscevir(x, 0);
        System.out.println(a);
    }

    public static String terscevir(String x, int ind) {
        if (x.length() == ind)
            return "";
        else
            return terscevir(x, ind + 1) + x.charAt(ind);

    }
}