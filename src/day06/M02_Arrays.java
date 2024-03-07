package day06;

public class M02_Arrays {
        /*
		 * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
		 * istenenToplam=9;
		 *
		 */
        public static void main(String[] args) {
            int [] arr={3,7,5,4,6,-1,2,1};
            int istenentoplam=3;
            int sayac=0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if (istenentoplam==arr[i]+arr[j]) {
                        System.out.println(" "+arr[i]+"+"+arr[j]+"="+istenentoplam);
                        sayac++;
                    }

                }

            }
            System.out.println(istenentoplam+" değerine eşit "+sayac+" adet sayı çifti bulunmuştur");
        }

}
