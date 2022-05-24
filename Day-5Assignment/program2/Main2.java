package com.te.program2;
import java.util.Scanner;
public class Main2 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		String s=scanner.nextLine();
        int check=UserCode2.checkCharacters(s);
        
        if(check==1) {
        	System.out.println("Valid");
        }
        else
        {
        	System.out.println("Invalid");
        }
	}

}
