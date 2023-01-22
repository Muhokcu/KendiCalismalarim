package Kodlama_Vakti.Inheritance_Kalitim;

public class D7GuvenlikGorevlisi extends D3Memur{
    String belge;

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public D7GuvenlikGorevlisi(String adSoyad, String ePosta, String telefon, String departman, String mesai, String belge) {
        super(adSoyad, ePosta, telefon, departman, mesai);
        this.belge = belge;

    }

}

