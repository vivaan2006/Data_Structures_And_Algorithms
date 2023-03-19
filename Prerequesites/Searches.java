package Prerequesites;

public class Searches {

    /**
     * get a sorted array hat you want to search through
     *
     * Determine the range of the array that you will search through. low = 0, high = array.length - 1 generally. first and last elements
     *
     * find the midpoint by adding low and high and dividing by 2
     *
     * Compare the target value you are searching for with the value at the midpoint index in the array.
     *
     * If the target value is less than the midpoint value, discard the upper half of the range and search only in the lower half. To do this, set the upper bound of the range to the midpoint minus 1.
     *
     * If the target value is greater than the midpoint value, discard the lower half of the range and search only in the upper half. To do this, set the lower bound of the range to the midpoint plus 1.
     *
     * If the target value is equal to the midpoint value, you have found the index of the target value in the array! Return the index.
     *
     * Repeat steps 3-7 until the target value is found or the range has been exhausted (i.e. the lower bound becomes greater than the upper bound).
     *
     * If the target value is not found in the array, return -1 to indicate that it was not found.
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
