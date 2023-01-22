package Calismalar;

public class IlkCalismam {
    public static void main(String[] args) {
        int i = 0;

        for (i = 0; i <= 1; i++) {
            //System.out.print(" * ");
            for (int j = 1; j <= i; j++) {
                System.out.print("=");
                // System.out.print(" * ");
                // System.out.print("=");

            }
        }
        for (i = 0; i <= 8; i++) {
            System.out.print(" * ");
            for (int j = 1; j <= i; j++) {

                // System.out.print(" * ");
                //System.out.print("=");
                // System.out.print("=");
                System.out.print("=");
            }

        }
    }

}