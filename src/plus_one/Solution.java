/*
 * Given a non-empty array of decimal digits representing a non-negative integer, 
 * increment one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of the list, 
 * and each element in the array contains a single digit.
 * 
 * You may assume the integer does not contain any leading zero, 
 * except the number 0 itself.
 * Example:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * 
 * If the last elements is 9 it will be changed to 0 and 
 * if all are 9 it will changed to 0 each elements and then 
 * we need to add an element  to the front of the array
 * and then return array.
 * 
 * Example:
 * Input: digits = [0]
 * Output: [1]
 */

package plus_one;

public class Solution {

	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] == 9) {

				digits[i] = 0;

			} else {

				digits[i]++;
				return digits;
			}
		}

		var res = new int[digits.length + 1];
		res[0] = 1;
		return res;

	}

}
