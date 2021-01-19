package RomantoInteger;

public class Solution {

	public int romanToInt(String s) {
		
		
		int sum = 0;
		int i = 0;

		while (i < s.length()) {
			// Don't pick the next 2 chars if out of bounds
			if (i != s.length() - 1) {
				// Get the next 2 characters. Don't use a substring, this is much faster.
				int c1 = s.charAt(i);
				int c2 = s.charAt(i + 1);
				
				// See if special
				boolean special = true;
				if (c1 == 'I' && c2 == 'V') {
					sum += 4;
				} else if (c1 == 'I' && c2 == 'X') {
					sum += 9;
				} else if (c1 == 'X' && c2 == 'L') {
					sum += 40;
				} else if (c1 == 'X' && c2 == 'C') {
					sum += 90;
				} else if (c1 == 'C' && c2 == 'D') {
					sum += 400;
				} else if (c1 == 'C' && c2 == 'M') {
					sum += 900;
				} else {
					special = false;
				}
				// If so, go to the next next character

				if (special) {
					i += 2;
					continue;
				}

			}
			//Add a standard character

			int c = s.charAt(i);
			switch (c) {
			case 'I':
				sum += 1;
				break;
			case 'V':
				sum += 5;
				break;
			case 'X':
				sum += 10;
				break;
			case 'L':
				sum += 50;
				break;
			case 'C':
				sum += 100;
				break;
			case 'D':
				sum += 500;
				break;
			case 'M':
				sum += 1000;
				break;
			}
			
			//Go to the next character
			i++;
			continue;
		}

		return sum;
	}

}
