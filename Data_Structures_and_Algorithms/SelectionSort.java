import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] sizes = {5, 10, 100, 1000, 5000, 10000, 50000};

        for (int size : sizes) {
            double totalRuntime = 0;

            for (int i = 0; i < 1000; i++) {
                List<Integer> randomList = generateRandomList(size);

                long startTime = System.nanoTime();
                selectionSort(randomList);
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

    public static void selectionSort(List<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
