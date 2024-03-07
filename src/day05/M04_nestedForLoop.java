package day05;

public class M04_nestedForLoop {
    public static void main(String[] args) {

        /*
        Aşağıdaki şekilde bir çıktı veren kodu yazınız
               1 2 3 4 5 6
                2 3 4 5 6
                 3 4 5 6
                  4 5 6
                   5 6
                    6
         */

        for (int satir = 1; satir <=6 ; satir++) { //Satır kontrolü
            for (int bosluk = 1; bosluk < satir; bosluk++) { //boşluk kontrolü
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <=6; rakam++) {
                System.out.print(rakam+" ");
            }
            System.out.println();
        }
    }
}
