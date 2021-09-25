/*
 * Implement strStr().
 * Return the index of the first occurrence of needle in 
 * haystack, or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */

package implement_str;

public class Solution {
	public int strStr(String haystack, String needle) {
        return searchRabinKarp(haystack, needle, 101);
    }
    
    public int searchRabinKarp(String txt, String pattern, int q) {
        final int d = 256; //no of alphabets
        int i, j;
        int p = 0; //hash of pattern
        int t = 0; //hash of given text
        int h = 1; //
        int M = pattern.length();
        int N = txt.length();
        
        if ( M > N) { 
            return -1; 
        }
        if ( M == 0 ) { 
            return 0; 
        }

        for(i = 0; i < M-1; i++) {
            h = (h*d)%q; //mod q prevents integer overflow
        }
        
        for(i=0; i<M; i++) {
            p = (d*(p) + pattern.charAt(i))%q;
            t = (d*(t) + txt.charAt(i))%q;
        }
        for(i=0; i<=N-M; i++) {
            if (p==t) {
                for(j=0; j<M; j++) {
                    if(txt.charAt(i+j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if(j == M) {
                    return i;
                }
            }
            if (i<N-M) {
                t = (d*(t - txt.charAt(i)*h)  + txt.charAt(i+M))%q;
                if (t < 0) {
                    t = t+q;
                }
            }
        }
        return -1;
     }

}
