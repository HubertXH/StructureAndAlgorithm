package jianzhiOffer;
/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？ 
 * @author Administrator
 */
public class RectCover {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int Rect(int n){
		if (n<=1) {
			return 1;
			
		}else if (n==2) {
			return 2;
		}else {
			return Rect(n-1)+Rect(n-2);
		}
	}
}
