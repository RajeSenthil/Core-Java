package com.te.Access;

public class UniqueLogic {
	
	public static int getUnique(int num) {
		int count=0;int num1=num,num2=num/10;
		while(num1>0) {
			int temp1=num1%10;
			while(num2>0) {
				int temp2=num2%10;
				if(temp1==temp2) {
					count++;
				}
				num2/=10;
			}
			num2/=10;
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
