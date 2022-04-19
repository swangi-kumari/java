public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        //person = rol // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for(int acc = 0; acc < accounts[person].length; acc++){
                sum += accounts[person][acc];
            }
            //now we have sum of accounts of person
            //check with overall ans
            if( sum > ans){
                ans= sum;
            }
        }
        return ans;
    }
}
