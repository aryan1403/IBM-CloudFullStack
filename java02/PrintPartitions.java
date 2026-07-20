package java02;

import java.util.ArrayList;
import java.util.List;

public class PrintPartitions {
    public static void printAllPartitions(int n) {
        List<Integer> currentPartition = new ArrayList<>();
        generate(n, n, currentPartition);
    }

    private static void generate(int remaining, int maxAllowed, List<Integer> current) {
        if (remaining == 0) {
            System.out.println(current);
            return;
        }

        int start = Math.min(remaining, maxAllowed);
        for (int i = start; i >= 1; i--) {
            current.add(i);
            generate(remaining - i, i, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("All partitions of " + n + ":");
        printAllPartitions(n);
    }
}
