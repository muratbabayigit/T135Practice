package day01;

public class M01_HelloWorld_Variables {
    public static void main(String[] args) {

        System.out.println("Hello World"); // Hello World
        System.out.println("Merhaba Java");// Merhaba Java
        System.out.print("Merhaba Aynı satır ");//print komutu ise bir sonraki kodu aynı satırdan devam ettirerek çalıştırır
        System.out.println("Merhaba!"); // println yazılırsa bir sonraki satırdaki kodu bir alt satıra geçerek yazdırır
        System.out.println("Tekrar Merhaba");
       // System.err.println("Ben Dünyalı");
        System.out.println("-----------------------------------------------------------------");

        String isim="Murat";
        System.out.println(isim); // Murat
        System.out.println("İsminiz : " + isim); //İsminiz : Murat
        System.out.println("-----------------------------------------------------------------");

        int sayi=3;
        // sayi=128;

        System.out.println("sayi"); // sayi
        System.out.println(3);// 3 sonucunu verir fakat dnamik olarak çalışmaz. değişken değişirse bile 3 yazdırır
        System.out.println(sayi);// 3 sonucunu veirir. değişken değişirse yen atanan değeri verir

        /*
        Java kodu çalıştırırken yukarıdan aşşağı doğru okur ve çalıştırır.
        Aynı satırda ise soldan sağa doğru çalıştırır
        Bu nedenle en son atanmı değer en son yazdırılır.
         */
        System.out.println("-----------------------------------------------------------------");
        int sayi2=30;

        System.out.println(sayi2+sayi2); // 60
        System.out.println(40+40); // 80
        System.out.println("40"+"30"); // 4030
        System.out.println(sayi2+sayi2);
        System.out.println(sayi2+""+sayi2);
        System.out.println("-----------------------------------------------------------------");
                /*
         Konsola tek satırda kod yazarak

               Hello World
               "Hello World"
         */
        System.out.println("Hello World");
        System.out.println("\"Hello World\""); // bir metnin başına çift tırnak koymak için başına \" yazılır

    /*
        Konsola Hello world     "Hello World" yazdırın (arada 2 tab tuşu mesafe olacak)

         */
        System.out.println("Hello Wolrd\t\t\"Hello World\"");// TAB tuşu kadar boşluk bırakmak için\t yazılmalıdır

        // Konsola  \Hello World\ yazdırın

        System.out.println("\\Hello World\\");

        System.out.println("Hello\nWorld");

          /*
        \" : " yazdırır
        \' :' yazdırır
        \n : alt satırdan yazdırmaya devam eder
        \t : bir TAB tuşu kadar boşluk bırakır
        \\ :\ yazar
         */



    }


}
