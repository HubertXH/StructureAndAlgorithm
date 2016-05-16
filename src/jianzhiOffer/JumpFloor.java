package jianzhiOffer;

/**
 * 青蛙跳台阶问题，一只青蛙可以一次跳上一个台阶，也可以一次跳上2个台阶，求，一个N阶的台阶，青蛙总过有多少种跳上去的方法。
 * 
 * @author Administrator
 *
 */

public class JumpFloor {

	/**
	 * 
	 * 假设有f(n)中跳法
	 * 当只剩最后一个台阶的时候，最后一个台阶只有1种跳法，而前n-1个台阶更具假设可知有f(n-1)种跳法
	 * 当只剩最后两个台阶的时候，青蛙有两种跳法，一次跳上去，或者分两次，每次一个跳上去，而前n-2个台阶有f(n-2)种跳法。
	 * 显然N个台阶的跳法f(n) = f(n-1)+f(n-2);
	 * 很显然这是一个斐波那契数列。
	 * 则，只需要找出n=1,和n=2 的跳法即可。
	 * @param n  所跳台阶的总数
	 * @return	  总共的跳法
	 */
	public int Jump(int n) {
		
		if (n<=0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		}else {
			return Jump(n-1)+Jump(n-2);
		}
	}
	
}
