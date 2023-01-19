public class ornek13 {
    //kendisine parametre olarak gelen stringteki
    // küçük karakterlerin sayısını geri döndüren rekürsif fonk. yazınız
    public static void main(String[] args) {
        int x = kucukkar("hasAN", 0, 0);//ilk stringteki küçük karakterleri başlangıç değeri / ikinci 0 başlangıç indisi değeri
        System.out.println(x);
    }

    public static int kucukkar(String str, int n, int ind) {
        if (ind == str.length()) {
            return 0;

        } else if (str.charAt(ind) >= 'a' && str.charAt(ind) <= 'z') {
            return 1 + kucukkar(str, n + 1, ind + 1);
        } else
            return kucukkar(str, n, ind + 1);
    }
}

