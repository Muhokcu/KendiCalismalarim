package CSKN.OOP_Giris;

public class Araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel() {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        if (tekerlekler == 4 || tekerlekler == 2) {
            this.kapilar = kapilar;
        } else {
            System.out.println("tekerlek " + tekerlekler + " olamaz hatali giris yaptiniz");
        }

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
