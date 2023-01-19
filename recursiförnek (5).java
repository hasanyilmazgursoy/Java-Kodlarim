public class ornek7 {
    // kendisine parametre olarak gelen
    // tek boyutlu sayısal dizi içindeki 100 sayısının olup olmadağını bulan recursif method

    public static int bul(int a[], int i, int sayac) {
        if (i >= a.length) return sayac;
        else if (a[i] == 100) sayac++; return bul(a, ++i, sayac);
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 32, -63, 100, 100, 96, 100, 74, 85, 4, 99, 100, 101};
        int adet = bul(a, 0, 0);
        System.out.println(adet + " tane dizide 100 vardır");
    }
}
