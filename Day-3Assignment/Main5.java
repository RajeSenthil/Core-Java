package com.te.assignment3;
import java.util.Scanner;

public class Main5 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {

		int limit1,limit2; boolean valid;
		System.out.println("Enter Array Limits");
        limit1=scanner.nextInt();
        limit2=scanner.nextInt();
        
    	int[] a=new int[limit1];
    	int[] b=new int[limit2];
    	
        for(int i=0;i<limit1;i++) {
        	do {
        			a[i]=scanner.nextInt();
        			if(i>0) {
        			valid= a[i-1]==a[i];
        		    if(valid) {
        		    	System.out.println("Already Entered");
        		    	a[i]=scanner.nextInt();
        		    }
        			}
        		    
        }while(false);
        }
        	
            for(int i=0;i<limit2;i++) {
            	do {
            			b[i]=scanner.nextInt();
            			if(i>0) {
                			valid= b[i-1]==b[i];
                		    if(valid) {
                		    	System.out.println("Already Entered");
                		    	b[i]=scanner.nextInt();
                		    }
                			}
            		    
            }while(false);
            
            }
    
        int sum=UserCode5.sumCommonelements(a,b);
        System.out.println(sum);

        
	}

}
