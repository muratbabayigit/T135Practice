package day03;

import java.util.Scanner;

public class M02_IfElseStatements {
    public static void main(String[] args) {


        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         * -----------------------------------------
         * Orn;
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
         * sonuc 320 olmalidir.
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
         * false; sonuc 300 olmalidir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Hız Değerini Giriniz: ");
        int velocity= scan.nextInt();
        System.out.println("Ehliyet Var Mı? E yada H giriniz"); //e, Evet---> E

        char isDriverLicence=scan.next().toUpperCase().charAt(0);

        if (isDriverLicence=='E'){
            if (velocity>=55 && velocity<=74){
                System.out.println("Ceza Tutarı: 100$");
            } else if (velocity>=75 && velocity<=84 ) {
                System.out.println("Ceza Tutarı: 150$");
            } else if (velocity>=85 && velocity<=94) {
                System.out.println("Ceza Tutarı: 320$");
            }else if (velocity>94 ) {
                System.out.println("Ceza Tutarı: 500$");

        }

    }else{
            if (velocity>=55 && velocity<=74){
                System.out.println("Ceza Tutarı: 300$");
            } else if (velocity>=75 && velocity<=84 ) {
                System.out.println("Ceza Tutarı: 350$");
            } else if (velocity>=85 && velocity<=94) {
                System.out.println("Ceza Tutarı: 520$");
            }else if (velocity>94 ) {
                System.out.println("Ceza Tutarı: 700$");

            }

        }

}
}

