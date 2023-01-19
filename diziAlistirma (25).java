public class ornek15b {
    public static void main(String[] args) {
        //b) satırlarını birleşirip tek boyutlu string dizisi yapınız


        String str[][] = {{"ab", "32a", "de"}, {"ali", "veli", "kaya"}, {"376", "2df", "z"}};
        String[] yedek = new String[3];
        String s = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                yedek[i] = yedek[i] + str[i][j];
            }
        }
        for (int i = 0; i < str.length; i++) {

            System.out.println(yedek[i]);
        }
    }
}