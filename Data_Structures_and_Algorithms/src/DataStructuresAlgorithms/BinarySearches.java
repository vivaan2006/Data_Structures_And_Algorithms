package DataStructuresAlgorithms;

public class BinarySearches {
    /**
     * create the binary search method that basically divides the values in half every time until the target is found
     * if value is not found or there is repitition, it returns -1.
     *
     * @param array  the array that is being searched
     * @param target the target value that is being searched for
     * @return the index of the target value
     */
    public static int binarySearch(int array[], int target) {
        // set low and high variables. high is the length of the array -1 because arrays start at 0
        int low = 1;
        int high = array.length - 1;

        // while loop that basically divides the array in half until the target is found
        while (low <= high) {
            int middle = low + (high - low) / 2;
            // the middle value is basically the array at the middle index

            int middleValue = array[middle];

            // printing that stuff
            System.out.println("Middle value: " + middleValue);

            // if the middle is less than the target, the low is set to the middle + 1 because it is on the left side of the array
            // it also means that the index has to be increased by 1 and its in the loop so once the value is reached, correct index will be returned
            if (middleValue < target) {
                low = middle + 1;
            }

            // if the middle is greater than the target, the high is set to the middle - 1 because it is on the right side of the array
            // subtracting index and putting it back in the array will give the correct index because loop goes down
            else if (middleValue > target) {
                high = middle - 1;
            }

            // this is the correct index if the middle value is the same as the array
            else {
                return middle;
            }
        }
        // if there are duplicates or the value is not found, it returns -1
        return -1;
    }

    /**
     * THis is the main method that basically feeds an array from 1-1000 and a target value of 420
     * it has a for loop that basically iterates throguh the array
     *
     * @param args
     */
    public static void main(String[] args) {

        // storage for the array and the target value
        int array[] = new int[1000];
        int target = 420;

        // loop that basically iterates through the array and sets the values to the index
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // calling the binary search method
        int index = BinarySearches.binarySearch(array, target);
    }
}
