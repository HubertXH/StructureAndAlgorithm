package jianzhiOffer;

public class IntegerPower {
	
	public double Power(double base,int exponent){
		
		double result = 1;
		
		if(exponent<0){
			for(int i =-1;i>=exponent;i--){
				result = result*base;
			}
			result = 1/result;
			return result;
		}else if(exponent == 0){
			return result;
		}else{
			for(int i = 1;i<=exponent;i++){
				result = result*base;
			}
			return result;
		}
		
	}
}
