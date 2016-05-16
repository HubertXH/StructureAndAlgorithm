package jianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * �����Ը����������
 * @author Administrator
 *
 */


public class Solution {
	
	public ArrayList<Integer> printListFormTailToHead(ListNode listNode)
	{
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<>();
		
		if (listNode==null) {
			return arrayList;
		}
		
		while(listNode!=null){
			stack.push(listNode.val);
			listNode =listNode.next;
		}
		
		while(!stack.isEmpty()){
			arrayList.add(stack.pop());
		}
		return arrayList;
	}
	
}
