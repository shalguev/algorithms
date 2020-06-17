package main.java.sort;


public class BubbleSort {
    public int[] sort(final int[] nums) {
        int swapNum = 0;
        int i = 0;
        boolean isFinished = false;

        while(!isFinished) {
            isFinished = true;
            for(int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    swapNum = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swapNum;
                    isFinished = false;
                }
            }
            i += 1;
        }
        return nums;
    }
}
