package Kodlama_Vakti.Inheritance_Kalitim;

public class D5Asistan extends D2Akademisyen {
    protected String yuksekLisans;


    public String getYuksekLisans() {
        return yuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        this.yuksekLisans = yuksekLisans;
    }

    public D5Asistan(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String dersler, String yuksekLisans) {
        super(adSoyad, ePosta, telefon, bolum, gorevler, dersler);
        this.yuksekLisans = yuksekLisans;

    }
}
