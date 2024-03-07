package day07.OkulYonetimi;

public class Kisi {

        /*
        Constructor olusturuken
        1-variable'ları private olarak oluştur
        2-parametreli constructor oluştur
        3-Parametresiz constructor oluştur
        4-Getter ve Setter'ları ayarlıyoruz
        5-toString ile yazdırma işlemini hazırlıyoruz.
         */


      /*
    Öğretmen: Ad-Soyad, Tc kimlik No, yaş
	Öğrenci: Ad-Soyad, Tc kimlik No, yaş
     */

    private String firstName;
    private String lastName;
    private String TCKN;
    private int age;

    public Kisi(String firstName, String lastName, String TCKN, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.TCKN = TCKN;
        this.age = age;
    }

    public Kisi() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTCKN() {
        return TCKN;
    }

    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", TCKN='" + TCKN + '\'' +
                ", age=" + age +
                '}';
    }

}
