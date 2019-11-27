/*

Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

*/
public int longestPalindrome(String s) {
        
        int[] count = new int[128];
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        
        int ans = 0;
        for(int v:count){
            ans = ans + (v/2 * 2);
            if(v%2 == 1 && ans%2 == 0){
                ans++;
            }
        }
        
        
        return ans;
    }
