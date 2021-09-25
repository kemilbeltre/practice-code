/*
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 
 * 32-bit integer range [-231, 231 - 1], then return 0
 */

package reverse_integer;

public class Solution {
	
	public static int reverse(int x) {
		
		boolean negative = false;
		if (x < 0) {
			negative = true;
			x *= -1;
		}

		long reversed = 0;
		while (x > 0) {
			reversed = (reversed * 10) + (x % 10);
			x /= 10;
		}
		if (reversed > Integer.MAX_VALUE) {
			return 0;
		}
		return negative ? (int) (-1 * reversed) : (int) reversed;
	}
	
	// Driver code 
    public static void main (String[] args)  
    { 
        int x = 4562; 
        System.out.println("Reverse of no. is " 
                           + reverse(x)); 
    } 

}
