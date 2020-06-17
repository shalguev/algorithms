package main;

import main.java.sort.BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int[] arr = new int[]{234,45345,7676,3569790,345,23,5,234,0,-10,-354346};
        final int[] bubbleArr = new BubbleSort().sort(Arrays.copyOf(arr, arr.length));
        Arrays.sort(arr);
        //System.out.println("arr: " + arr + "\nbubbleArr: " + bubbleArr);
        System.out.println("Arrays.equals: " + Arrays.equals(arr, bubbleArr));
    }
}
