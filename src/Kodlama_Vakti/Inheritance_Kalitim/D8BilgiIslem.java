package Kodlama_Vakti.Inheritance_Kalitim;

public class D8BilgiIslem extends D3Memur{
    String gorev;

    public D8BilgiIslem(String adSoyad, String ePosta, String telefon, String departman, String mesai, String gorev) {
        super(adSoyad, ePosta, telefon, departman, mesai);
        this.gorev = gorev;
    }
}
