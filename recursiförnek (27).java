public class matristoplambulma {
    public static void main(String[] args) {
        int x[][] = {{11, 43}, {22, 34}};
        int y[][] = {{22, 32}, {30, 44}};
        int z = matristoplamı(x, y, 0, 0);
        System.out.println(z);

    }

    public static int matristoplamı(int x[][], int y[][], int i, int j) {
        if (i >= x.length || j >= x.length) {
            return 0;
        }
        int toplam = x[i][j] + y[i][j];
        if (j == x.length - 1) {
            i++;
            j = 0;
        } else {
            j++;
        }
        return toplam + matristoplamı(x, y,i,j);}
}