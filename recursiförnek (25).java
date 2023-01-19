public class ornek27 {
    public static void main(String[] args) {
        //kendisine parametre olarak gelen dizide kaç tane küçük karekter vardır

        char liste[] = {'s', 'f', 'a', 'c', 'b', 'A', 'D', 's', 'A', 'P'};
        int x = kucukHarfSayisi(liste, 0, 0);
        System.out.println(x);

    }

    public static int kucukHarfSayisi(char liste[], int i, int sayac) {
        if (i == liste.length) {
            return sayac;
        }
        if (liste[i] >= 'a' && liste[i] <= 'z') {
            return kucukHarfSayisi(liste, i + 1, sayac + 1);
        } else return kucukHarfSayisi(liste, i + 1, sayac);

    }
}
