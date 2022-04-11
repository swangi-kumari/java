//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if you do not find a pivot, it means array is nt roated
        if( pivot == -1){
            //do normal binary search
            return binarySearch(nums, target, 0, nums.length -1);
        }
        //if pivout found, you have found 2 asc sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
   ;

        while (start <= end) {
            //find middle element
//            int mid = (start + end ) /2; // might be possible that (start + end) mid exceed the range of integer
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0; int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            //4cases over here
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start = 0; int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) /2;
            //4cases over here
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
           //if elementsat middle,start, end are equal then skip duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //check if start is pivot
                if(arr[start] > arr[start +1]){
                    return start;
                }
                start++;
                //check wheather end is pivot
                if(arr[end] < arr [end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
