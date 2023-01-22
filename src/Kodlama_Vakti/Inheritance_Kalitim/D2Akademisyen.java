package Kodlama_Vakti.Inheritance_Kalitim;

public class D2Akademisyen extends D1Calisan {
    String bolum, gorevler;
    String dersler;

    public D2Akademisyen(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String dersler) {
        super(adSoyad,ePosta,telefon);


        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler = dersler;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorevler() {
        return gorevler;
    }

    public void setGorevler(String gorevler) {
        this.gorevler = gorevler;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }

    public void derseGir() {
        System.out.println("Derse Girildi...!");

    }


}
