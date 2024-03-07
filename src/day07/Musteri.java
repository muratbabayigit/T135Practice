package day07;

public class Musteri {
        /*
Bir müşteri sınıfı oluşturun ve bu sınıf içinde müşteri adı, soyadı,
e-posta adresi ve telefon numarasını temsil eden özellikler (fields) olsun.
Parametresiz bir constructor ile müşteri nesnesi oluşturulduğunda
bu özellikler varsayılan değerlere sahip olsun. Ayrıca,
parametreli bir constructor ile müşteri bilgilerini
belirli değerlere göre set edebilmek için gerekli metotları ekleyin.

Müşteri sınıfının bir örneğini oluşturun,
hem parametresiz constructor'ı hem de parametreli
constructor'ı kullanarak müşteri bilgilerini ekrana yazdırın.

 */
       static String clientFirstName;
       static String clientlastName;
       static String clientMail;
       static String clientPhoneNumber;

    public Musteri() {
        clientFirstName="Murat";
        clientlastName="Yiğit";
        clientMail="myigit@gmail.com";
        clientPhoneNumber="+4457825636987";
    }

    public Musteri(String clientFirstName, String clientlastName, String clientMail, String clientPhoneNumber) {
        this.clientFirstName = clientFirstName;
        this.clientlastName = clientlastName;
        this.clientMail = clientMail;
        this.clientPhoneNumber = clientPhoneNumber;
    }


    public static void main(String[] args) {

       bilgileriyazdir();
    }

    private static void bilgileriyazdir() {
        System.out.println("----- Kullanıcı Bilgileri -----");
        System.out.println("Adı: "+clientFirstName);
        System.out.println("Soyadı: "+clientlastName);
        System.out.println("Mail Adresi: "+clientMail);
        System.out.println("Telefonu: "+clientPhoneNumber);
    }
}
