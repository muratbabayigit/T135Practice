package day07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GunBulma {
    // Soru 1:
   // Kullanıcıdan bir tarih alarak, o tarihin hangi gün olduğunu bulan bir Java programı yazın.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Tarih (GG.AA.YYYY) :");
        String day= scan.nextLine();


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date=LocalDate.parse(day,formatter);
        String nameofDay=date.getDayOfWeek().toString();

        System.out.println("Girilen Gün "+ nameofDay+ " günüdür.");
    }
}
