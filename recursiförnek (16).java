public class ornek18 {
    public static void main(String[] args) {
        //tek boyutlu string dizisini birleştirip tek bir string haline getirip

        String list[] = {"hasan", "yılmaz", "gürsoy"};
        String x = birlestir(list, 0);
        System.out.println(x);

    }

    public static String birlestir(String list[], int i) {
        if (i >= list.length) {
            return "";
        } else return list[i] + birlestir(list, i + 1);
    }
}