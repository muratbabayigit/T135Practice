package day06;

public class M04_NestedArrays {
    public static void main(String[] args) {
          /*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8},9}
         * Output : 9
         */

        int [][] arr={{18,4,2},{8,3},{6,2365,5}};
        int enbuyuk=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j]>enbuyuk){
                enbuyuk=arr[i][j];
            }
                
            }

        }
        System.out.println("Arraydeki en büyük değerli eleman: "+enbuyuk);



    }
}
