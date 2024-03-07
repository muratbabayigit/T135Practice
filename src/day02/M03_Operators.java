package day02;

public class M03_Operators {
    public static void main(String[] args) {
    /*
    Operatörler

       += :  sayi+=n  bu işlemde sayıya n ekler ve yeni değer olarak sayıya atar
       -= :  sayi-=n  bu işlemde sayıdan n çıkarır ve yeni değer olarak sayıya atar
       *= :  sayi*=n  bu işlemde sayıyı n ile çarpar ve yeni değer olarak sayıya atar
       /= :  sayi/=n  bu işlemde sayıyı n'e böler ve yeni değer olarak sayıya atar
       %  :  sayi%n   bu işlemde sayının n ile bölümünden kalanı verir ve yeni değer olarak sayıya atar
     */

        int a=100;
        System.out.println(a+=100); //a değeri 100 artırırldı
        System.out.println("a= "+a); // 200

        int b=10;
        System.out.println(b+10); //b'ye 10 eklendi
        System.out.println("b= "+b); // 10

        int c=50;
        System.out.println(c*=10);
        System.out.println("c= "+c); // 500

        int d=300;
        System.out.println(d/=10);
        System.out.println("d = " + d); // 30

        int e=235;
        System.out.println(e%2);
        System.out.println("e = " + e); // 235

        int f=45;
        System.out.println(f-=5);
        System.out.println("f = " + f); // 40

        int g=233;
        System.out.println(g%=2);
        System.out.println("g = " + g); // 1


    }
}
