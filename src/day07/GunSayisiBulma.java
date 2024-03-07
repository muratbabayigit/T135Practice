package day07;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GunSayisiBulma {
    public static void main(String[] args) {
        //Belirli bir tarih aralığındaki gün sayısını bulan bir Java programı yazın.

        LocalDate startDate=LocalDate.of(1980,05,07);
        LocalDate endDate=LocalDate.of(2024,03,07);

        long daysOfMyLife= ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println("daysOfMyLife = " + daysOfMyLife);

        System.out.println(LocalDate.now());
    }
}
