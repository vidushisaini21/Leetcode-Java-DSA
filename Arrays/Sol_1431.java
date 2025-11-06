// LeetCode 1431 : Kids With the Greatest Number of Candies
// Problem Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
// solution

import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int candy : candies){
            if(candy> max){
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            result.add(candy+extraCandies >= max);
        }
        return result;
    }
}
