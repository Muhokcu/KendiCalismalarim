package arraylar_ArrayListler_StringSinifi_LinkedListler;

import java.util.Arrays;

public class Arrayler {

    public static void arrayi_bastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ":" + array[i]);

        }
    }

    public static void main(String[] args) {


        // int[] a1 = new int[10];

      /*  a1[5] = 32;
        a1[9] = 50;*/
        //double[] b1;

        int[] a = {30, 40, 50, 60, 70};
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[2] = " + a[2]);
        //System.out.println("a[6] = " + a[5]);// hata verir
        int[] a1 = new int[5];

        int[] b1 = {10, 20, 30, 40, 50, 17};

        arrayi_bastir(b1);
        ortalamabul(b1);
        System.out.println("ortalamabul(b1) = " + ortalamabul(b1));
        System.out.println("b1.length = " + b1.length);


        //for (int i = 0; i < 5; i++) {
        //  a1[i] = i * 4 + 2;

        //System.out.println("a1[i] = " + a1[i]);
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        //    a1[i]= scanner.nextInt();


        //   for (int i = 0; i < 5; i++) {

        // System.out.print(" "+ a1[i] );


        // int [] b1 = {10,20,30,40,50};
        //  System.out.println("Arrayin uzunlugu : " + b1.length);
        System.out.println("b1.length = " + b1.length);


    }

    public static double ortalamabul(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return ((double) toplam / array.length);



    }
}

