public class ornek16 {
    public static void main(String[] args) {
        // ila ?ilev edBCba şeklinde yazan programı yaz

        String str[] = {"ali", "3veli?", "abBCde"};
        String s = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                s = s + str[i].charAt(j);
            }
            System.out.println(s);
        }
    }
}
