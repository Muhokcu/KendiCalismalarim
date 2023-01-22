package Kodlama_Vakti.Inheritance_Kalitim;

public class D6OgretimUyesi extends D2Akademisyen {
    String unvan;

    public D6OgretimUyesi(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String dersler, String unvan) {
        super(adSoyad, ePosta, telefon, bolum, gorevler, dersler);
        this.unvan = unvan;

    }
}
