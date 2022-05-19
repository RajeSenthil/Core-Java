package com.te.Access;

public class UserMainCode {
	
	public static int checkSum(int num) {
	
		int temp=0,count=0,sum=0;
		while(num>0)
		{
		temp=num%10;
        count++;
        if(count==1 || (count%2 !=0) ){
         sum+=temp; 
            }
        num/=10;
		}
		if(sum%2 != 0)
		{
			return 1;
		}
		else {
			return 0;
		}
	}

}
