package com.te.Access;

public class SevenLogic {
	
	public static int countSeven(int num) {
		int count=0;int num1=num,temp2=7;
		while(num1>0) {
			int temp1=num1%10;
				if(temp1==temp2) {
					count++;
				}
				num1/=10;
			}
        if(count==0) {
        	return 1;
        }
        else {
        	return 0;
        }
		
	}

}
