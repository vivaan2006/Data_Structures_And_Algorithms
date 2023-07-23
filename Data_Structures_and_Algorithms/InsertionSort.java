import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int[] sizes = {5, 10, 100, 1000, 5000, 10000, 50000};

        for (int size : sizes) {
            double totalRuntime = 0;

            for (int i = 0; i < 1000; i++) {
                List<Integer> randomList = generateRandomList(size);

                long startTime = System.nanoTime();
                insertionSort(randomList);
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

    public static void insertionSort(List<Integer> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }
}