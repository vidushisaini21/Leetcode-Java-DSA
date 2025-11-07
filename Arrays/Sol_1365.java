// 1365. How Many Numbers Are Smaller Than the Current Number1365. How Many Numbers Are Smaller Than the Current Number
// Problem Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
// slotion 

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            int j =0;
            for(int k =0; k<n; k++){
                if((nums[k]<nums[i]) && (k!=i)){
                    j++;
                   
                }
            }
            ans[i]=j;
            
        }
        return ans;
    }
}




