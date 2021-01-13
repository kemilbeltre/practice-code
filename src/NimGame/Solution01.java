/*  
 * We consider the following two-person game, called Nim, in which players
 * alternate turns. The game begins with a pile of n(identical) stones.
 * During a player's turn, they may remove either 1, 2 or 3 stones from 
 * the pile. If a player cannot make a move, that player loses. This
 *  game is denoted as (1,2,3)-Nim game, in light of the allowed
 *  moves of removing 1,2 or 3 stones. 
 * 
 */
package NimGame;

public class Solution01 {

	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}

}
