package metotlar_overloading;

public class KodBloklarindakiLokalDegisiklikler2 {

    public static void main(String[] args) {
        int i = 0;

        int sayac = 0;
        while (i < 100) {


            if (i % 3 == 0) {

                String yazdir = "Cift";
                System.out.print(" " + sayac);
                //  System.out.println("yazdir = " + yazdir);


            }

            sayac++;
            i++;

        }


    }
}
