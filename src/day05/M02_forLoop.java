package day05;

public class M02_forLoop {
    public static void main(String[] args) {
        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın
         */

        String text="Java Candır. Gerisi Heyecandır";
        int aSayisi=0;
        for (int i = 0; i <text.length() ; i++) {
            if (text.toLowerCase().charAt(i)=='a'){
                aSayisi++;
            } else if (text.toLowerCase().charAt(i)=='c') {
                break;

            }

        }
        System.out.println("Cümledeki a harfi sayısı: "+aSayisi);

    }
}
