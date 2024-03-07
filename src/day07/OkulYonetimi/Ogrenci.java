package day07.OkulYonetimi;

public class Ogrenci extends Kisi{
    //Öğrenci: Ad-Soyad, Tc kimlik No, yaş, numara, sınıf bilgileri içermelidir.

    private int number;
    private String className;

    public Ogrenci(String firstName, String lastName, String TCKN, int age, int number, String className) {
        super(firstName, lastName, TCKN, age);
        this.number = number;
        this.className = className;
    }

    public Ogrenci() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return  " " +super.toString()+
                "Numarası:" + number +
                ", Sınıfı:" + className + ' ' +
                '}';
    }

}
