package com.te.Access;

public class UserCOde {
	public static int oddDigits(int num) {
		int temp=0,sum=0;
		while(num>0)
		{
		temp=num%10;
        if(temp%2!=0){
         sum+=temp; 
            }
        num/=10;
	}
		if(sum%2!=0) {
         return 1;
}
		else {
			return -1;
		}
}
}