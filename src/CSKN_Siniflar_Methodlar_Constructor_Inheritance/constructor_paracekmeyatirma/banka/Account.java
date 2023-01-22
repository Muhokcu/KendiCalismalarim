package CSKN_Siniflar_Methodlar_Constructor_Inheritance.constructor_paracekmeyatirma.banka;

public class Account {
    private String isim;
    private String email;
    private String hesapNo;
    private String telefonNo;
    private double bakiye;

    public Account() {

        // System.out.println("Kendi Yazdigimiz Counstructor");

    }

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

    }


    public void paraYatir(double miktar) {
        System.out.println("Suan ki Bakiyeniz = " + bakiye);
        System.out.println("Yapilan Islem = Hesaba Para Yatirma");
        System.out.println("Yatirilan Miktar = " + miktar);
        bakiye += miktar;
        System.out.println("Yeni Bakiye = " + bakiye);

    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Cekilmek istenen miktar = " + miktar + " \n" +
                    "Bir gunde max 1500 Euro cekebilirsiniz");
            //  System.out.println("Bakiye = " + bakiye);


        } else if (bakiye - miktar < 0) {

            System.out.println("Yeterli Bakiye Bulunmamaktadir..." + bakiye);
        } else {
            System.out.println("Yapilan Islem = Hesaptan Para Cekme");
            System.out.println("Cekilen Miktar = " + miktar);
            bakiye -= miktar;
            System.out.println("Kalan Bakiye " + bakiye);
        }

    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
