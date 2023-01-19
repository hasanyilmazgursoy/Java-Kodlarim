public class ornek15a {
    public static void main(String[] args) {

        //a)sütünlarını birleştirip tek boyutlu yapan algoritma

        String str[][] = {{"ab", "32a", "de"}, {"ali", "veli", "kaya"}, {"376", "2df", "z"}};
        String s = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                s = s + str[i][j];
            }
        }
        System.out.println(s);
    }
}
