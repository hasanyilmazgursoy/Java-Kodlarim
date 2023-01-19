public class ornek16b {
    public static void main(String[] args) {
        //dizide küçük harf olanları büyük yapan program

        String str[] = {"ali", "3veli?", "abBCde"};
        String s = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) >= 'a' && str[i].charAt(j) <= 'z') {
                    s = s + (char) (str[i].charAt(j) - 32);

                } else if (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z') {
                    s = s + (char) (str[i].charAt(j) + 32);
                } else
                    s = s + str[i].charAt(j);
            }
            System.out.println(s);
        }
    }
}


