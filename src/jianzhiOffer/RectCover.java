package jianzhiOffer;
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ����� 
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
