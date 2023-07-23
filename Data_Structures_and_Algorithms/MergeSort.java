import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        int[] sizes = {5, 10, 100, 1000, 5000, 10000, 50000};

        for (int size : sizes) {
            double totalRuntime = 0;

            for (int i = 0; i < 1000; i++) {
                List<Integer> randomList = generateRandomList(size);

                long startTime = System.nanoTime();
                List<Integer> sortedList = mergeSort(new ArrayList<>(randomList));
                long endTime = System.nanoTime();

                totalRuntime += (endTime - startTime) / 1_000_000.0;
            }

            double averageRuntime = totalRuntime / 1000.0;
            System.out.printf("List size: %5d, Average Runtime: %.3f ms%n", size, averageRuntime);
        }
    }

    public static List<Integer> generateRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> mergedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                mergedList.add(left.get(leftIndex++));
            } else {
                mergedList.add(right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            mergedList.add(left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            mergedList.add(right.get(rightIndex++));
        }

        return mergedList;
    }
}