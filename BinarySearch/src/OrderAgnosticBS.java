public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, - 12, -4, 0, 2, 3, 4, 15, 16, 18};
        int target = 15;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

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
