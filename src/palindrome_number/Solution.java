/*
 * 
 * Given an integer x, return true if x is palindrome integer.
 *  integer is a palindrome when it reads the same backward as forward.
 *   For example, 121 is palindrome while 123 is not.
 */

package palindrome_number;

public class Solution {
	
public boolean isPalindrome(int x) {
        
        if (x > 0 && x <= 9) return true;
        
        int num = x;
        int y = 0;
        
        while (num > 0){
            
            if (num <= 9) y = (y + (num % 10));
            else   y = (y + (num % 10)) * 10;
                num /= 10;   
        }
        return y == x;
    }

}
