package jianzhiOffer;
/**
 * 将字符串中的空格用"%20"替换；
 * @author Administrator
 *
 */
public class replaceSpace {

	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("l v ove  l v e");
		
		String  string = replace(stringBuffer);
		
		System.out.println(string);
		
		
	}
	
	public static String replace(StringBuffer str)
	{
		
		if (str==null)
		{
			return null;
		}
		
		for(int i  = 0;i<str.length();i++)
		{
			char c = str.charAt(i);
			
			if (c == ' ') 
			{
				str.replace(i, i+1, "%20");
			}
		}
		
		String newString = str.toString();
		
		return newString;
	}
	
	
	
	
//	public static String replace(StringBuffer stringBuffer)
//	{
//		
//		String newString =  stringBuffer.toString();
//		
//		String[] target = newString.split("\\s+");
//		
//		String returnString=null;
//		
//		for(int i =0;i<target.length;i++)
//		{
//			if (i == 0) {
//				
//				returnString = target[i]+"%20";
//			}
//			else if (i<target.length-1) 
//			{
//				returnString = returnString+target[i]+"%20";
//			}
//			else if (i==target.length-1)
//			{
//				returnString =returnString+ target[i];
//			}
//		}
//
//		return returnString;
//	}
}
