import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] sizes = {5, 10, 100, 1000, 5000, 10000, 50000};

        for (int size : sizes) {
            double totalRuntime = 0;

            for (int i = 0; i < 1000; i++) {
                List<Integer> randomList = generateRandomList(size);

                long startTime = System.nanoTime();
                quickSort(new ArrayList<>(randomList), 0, randomList.size() - 1);
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

    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(list, low, high);
            quickSort(list, low, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, high);
        }
    }

    public static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }
}
