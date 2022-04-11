//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {

    }
    int search (int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return  firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak +1, arr.length-1);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                //decreasing part of array  // maybe ans, but look at left
                end = mid;
            } else {
                start = mid +1; //because we know that mid + 1 element > mid element
            }
        }
        //in end, start== end & pointing to the largest no. because of the 2 checks
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is max
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        //find whether the array is sorted in ascending or desending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find middle element
//            int mid = (start + end ) /2; // might be possible that (start + end) mid exceed the range of integer
            int mid = start + (end - start) / 2;

            //common for both acs des
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {         //for ascending
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {              //for descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
