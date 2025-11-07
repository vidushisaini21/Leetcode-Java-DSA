// Leetcode 1832. Check if the Sentence Is Pangram
// Problem link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
// Solution 

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
}
