public class ornek33 {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int toplam = topla(a, b, 0, 0);
        System.out.println(toplam);

    }

    public static int topla(int[][] a, int[][] b, int i, int j) {
        if (i >= a.length || j >= a.length) {
            return 0; // dizilerin tüm elemanları dolduysa, toplamı döndürür
        }
        int toplam = a[i][j] + b[i][j]; // iki dizinin aynı indekslerdeki elemanlarını topla
        // eğer dizinin son sütununu geçtiysek, sonraki satıra geç
        if (j == a.length - 1) {
            i++;
            j = 0;
        } else {
            // sütuna geçer
            j++;
        }
        // ilerlemeye devam eder ve toplamı geri döndürür
        return toplam + topla(a, b, i, j);
    }

}
