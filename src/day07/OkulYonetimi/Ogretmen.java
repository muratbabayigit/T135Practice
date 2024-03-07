package day07.OkulYonetimi;

public class Ogretmen extends Kisi{
    //Öğretmen: Ad-Soyad, Tc kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.

    private String bolum;
    private int sicilNo;

    public Ogretmen(String firstName, String lastName, String TCKN, int age, String bolum, int sicilNo) {
        super(firstName, lastName, TCKN, age);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return " "  + super.toString()+
                " Branşı:" + bolum + ' ' +
                ", Sicil No:" + sicilNo +
                ' ';
    }
}
