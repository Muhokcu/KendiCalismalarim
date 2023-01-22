package arraylar_ArrayListler_StringSinifi_LinkedListler;

public class Deneme {
    public static void main(String[] args) {


        String b = "Muhammet";
        System.out.println(b);
        System.out.println("O. indeks : " + b.charAt(0));
        System.out.println("2. indeks : " + b.charAt(2));
        System.out.println("son indeks : " + b.charAt(b.length() - 1));

        for (int i = 0; i < b.length(); i++) {// bu for dongusu ile muhammet i yazdirabiliyoruz
            System.out.print(b.charAt(i));

        }
        System.out.println();
        System.out.println(b.indexOf('a'));// ilk a nin oldugu indeks sayisi
        System.out.println(b.toLowerCase());// hepsini kucuk yapma
        System.out.println(b.toUpperCase());// hepsini buyuk yapma
        String a1 = "1905";
        int b1= Integer.parseInt(a1);// bununla Stringi integere ceviriyoruz
        System.out.println(b1);

        int c1 = 1905;
        String c2= String.valueOf(c1);// bu durumda Stringi int a cevirdik
        System.out.println("c2 = " + c2);

        String a2 = "Muhammet";// burda iki durumda a2 ve b2 hafizada ayni yeri isaret ediyor
        String b2 = "Muhammet";

        if (a2==b2){
            System.out.println("Esitler");// bu nedenle esittir sonucu cikiyor

            String a3 = new String("Muhammet"); // boyle bir tanimlama yaptigimizda icerikler ayni olsa bile hafiza farkli yerleri gosterdikleri icin esit olrak gorulmuyor
            String b3 = new String("Muhammet");
            if (a3==b3){
                System.out.println("Esitler");
            }else
                System.out.println("Esit degiller");//  sonuc esit degil
            // fakat biz bunlarin iceriklerini kiyaslamak istersek equals methodunu kullanabiliriz

            if (a3.equals(b3)){// bu durumda sadece icerik kiyaslamasi yapmis olduk
                System.out.println("Esit");
            }

            String x = "10";
            String y = "20";
            String z = x + y;
            System.out.println("z = " + z);




        }

    }
}
