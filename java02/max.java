package java02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class max {
    public static int calMax(int... nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    public static int calMin(List<Integer> nums) {
        return nums.stream().max((a, b) -> a > b ? -1 : 0).get();
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println("Max:" + calMax(1, 2, 3, 34));
        System.out.println("Min:" + calMin(nums));
    }
}
