import java.util.*;

public class HeapSort {

    public static void main(String[] args) {
        int[] sizes = {5, 10, 100, 1000, 5000, 10000, 50000};

        for (int size : sizes) {
            double totalRuntime = 0;

            for (int i = 0; i < 1000; i++) {
                List<Integer> randomList = generateRandomList(size);

                long startTime = System.nanoTime();
                heapSort(randomList);
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

    public static void heapSort(List<Integer> list) {
        int n = list.size();

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            heapify(list, i, 0);
        }
    }

    public static void heapify(List<Integer> list, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && list.get(leftChild) > list.get(largest)) {
            largest = leftChild;
        }

        if (rightChild < n && list.get(rightChild) > list.get(largest)) {
            largest = rightChild;
        }

        if (largest != i) {
            int swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            heapify(list, n, largest);
        }
    }
}