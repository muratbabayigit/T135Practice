package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToBinary {
    // Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Binary'ye çevirmek istediğiniz sayıyı giriniz: ");
        int decimal= scan.nextInt();
        convertToBinary(decimal);
    }

    private static void convertToBinary(int decimal) {
        ArrayList<Integer> binary=new ArrayList<>();
            while(decimal>=1){
                binary.add(decimal%2);
                decimal/=2;
            }
        for (int i = binary.size()-1; i >=0 ; i--) {
            System.out.print(binary.get(i)); // 234=11101010
        }   

    }



}
