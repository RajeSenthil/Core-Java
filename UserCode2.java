package com.te.Access;

public class UserCode2 {
	public static int EvenDigits(int num) {
		int temp=0,sum=0;
		while(num>0)
		{
		temp=num%10;
        if(temp%2==0){
         sum+=temp*temp; 
            }
        num/=10;
	}
		if(sum%2==0) {
         return 1;
}
		else {
			return -1;
		}
}
}
