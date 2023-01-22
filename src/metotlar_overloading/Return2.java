package metotlar_overloading;

public class Return2 {
    public static void main(String[] args) {

        System.out.println("ikiilecarp(9) = " + ikiilecarp(9));
        System.out.println("ikiiletopla(10) = " + ikiiletopla(10));
        System.out.println("dortilecarp(10) = " + dortilecarp(10));
        System.out.println("sonuc : dortilecarp(ikiiletopla(ikiilecarp(8))) = " + dortilecarp(ikiiletopla(ikiilecarp(8))));


    }

    public static int ikiilecarp(int a) {
        return a * 2;
    }

    public static int ikiiletopla(int a) {
        return a + 2;
    }

    public static int dortilecarp(int a) {
        return a * 4;

    }
}
