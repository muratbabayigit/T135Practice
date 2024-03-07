package day05;

public class M05_nestedForLoop {

    /*
    Aşağıdaki şekli çıktı olarak verecek kodu yazınız

         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
     */

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
