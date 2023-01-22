package Grup4Calismalarimiz;

import java.util.Scanner;

public class SeyahatProjesi {
    // package Ömer.a_Switch_Case_Mentoring_2;
    public class Switch3_Seyahat_Projesi {
        //  public static void main(String[] args) {
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.
        todo İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---
         (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
        todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */
    }

    public static void main(String[] args) {
        double gidilenYol;
        double kmFiyati = 0.4;
        double tutar = 10;
        int acilis = 10;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Nereye Yolculuk etmek istiyorsunuz = ");

        gidilenYol = girdi.nextDouble();
        System.out.println("Her 20 km icin odenmesi gerekne miktar 5 Euro dur ");
        String sehir = " ";
        int Frankfurt = 60;
        int Koln = 80;
        int Berlin = 200;
        //if (sehirFrankfurt){
        tutar = (kmFiyati * Frankfurt);
        //  } else if (sehir =Koln) {
    }
    //   tutar = (kmFiyati * gidilenYol);
    //  tutar += acilis;
    //   tutar = (tutar < 20) ? 20 : tutar;

    //  System.out.println("Odenecek tutar = " + tutar);

    public static class IlkCalismam {
        public static void main(String[] args) {
            int i = 0;

            for (i = 0; i <= 1; i++) {
                //System.out.print(" * ");
                for (int j = 1; j <= i; j++) {
                    System.out.print("=");
                    // System.out.print(" * ");
                    // System.out.print("=");

                }
                for (i = 0; i <= 8; i++) {
                    System.out.print(" * ");
                    for (int j = 1; j <= i; j++) {

                        // System.out.print(" * ");
                        //System.out.print("=");
                        // System.out.print("=");

                    }
                    System.out.print("=");
                }
            }
        }
    }
}





