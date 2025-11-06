// LeetCode 1512. Number of Good Pairs
// Problem Link : https://leetcode.com/problems/number-of-good-pairs/description/
// solution 

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i =0; i<n; i++){
            for(int j =1; j<n; j++){
                if((nums[i]==nums[j]) && (i<j)){
                    result ++;
                }
            }
        }
        return result;
    }
}
