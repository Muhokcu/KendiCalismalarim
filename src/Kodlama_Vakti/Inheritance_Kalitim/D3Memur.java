package Kodlama_Vakti.Inheritance_Kalitim;

public class D3Memur extends D1Calisan {
    String departman, mesai;

    public D3Memur(String adSoyad, String ePosta, String telefon, String departman, String mesai) {
        super(adSoyad, ePosta, telefon);
        this.departman = departman;
        this.mesai = mesai;
    }
}
