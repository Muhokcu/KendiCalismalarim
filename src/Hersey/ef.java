package Hersey;

import java.util.Arrays;

public class ef {
    public static void main(String[] args) {
        int [] nums ={6,-4,12,0,-10};
        int x=12;
        int y = Arrays.binarySearch(nums,x);
        System.out.println("y = " + y);
    }
}
