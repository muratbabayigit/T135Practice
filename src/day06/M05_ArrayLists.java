package day06;

import java.util.ArrayList;
import java.util.Arrays;

public class M05_ArrayLists {
    public static void main(String[] args) {

         /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> listIsmler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        
        ArrayList<String> list2=new ArrayList<>();
        for (String a:listIsmler) {
            if (!a.toLowerCase().contains("a")){
                list2.add(a);
            }
            
        }
        System.out.println(list2);


        //2.ÇÖZÜM

        ArrayList <String> isimler=new ArrayList<>(); //17.Satırın alternatif şeklidir.
        isimler.add("Murat");
        isimler.add("Tarık");
        isimler.add("Sibel");
        isimler.add("Esma Sena");

        ArrayList<String> list=new ArrayList<>();
        for (String a:isimler) {
            if (!a.toLowerCase().contains("a")){
                list.add(a);
            }

        }
        System.out.println(list);



        }

    }

