public class ornek1 {
    public static void main(String[] args) {
        // kendisine parametre olarak gelen
        // tek boyutlu sayısal dizi içindeki 100 sayısının olup olmadağını booleam ile bulan recursif method

        int list[]={4,54,4554,645,4545,4858,7,7,7565,54,56,25,466575,521,6,8};
        boolean x=bulma100(list,0);
        System.out.println(x);

    }public static boolean bulma100 (int[]list,int i){
        if (i== list.length){
            return false;
        }if(list[i]==100){
            return true;
        }else return bulma100(list,i+1);
    }
}
