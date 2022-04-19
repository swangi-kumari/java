public class main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 89, 19, -5, -11, 28};
        int target = 12;
        int ans = linearSearch2(nums, target);
        System.out.println(ans);

    }

    //search thr target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

//        run a for loop
        for (int element : arr) {
            //check for element at every index if it is target
            if (element == target) {
                return element;
            }
        }
        //this will excute no return statemt hit
        return -1;
    }





    //search in the array: return the index if found; if not, return 0
//    static int linearSearch(int[] arr, int target) {
//        if(arr.length == 0){
//            return -1;
//        }
//
//        //run a for loop
//        for (int index =  0; index < arr.length; index++){
//            //check for element at every index if it is target
//            int element = arr[index];
//            if (element == target){
//                return index;
//            }
//        }
//
//        //this will excute no return statemt hit
//        return -1;
//
//
//    }

}





