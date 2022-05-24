package com.te.program1;
import java.util.Scanner;
public class Main1 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		String s=scanner.nextLine();
        String mid=UserCode1.getMiddleChars(s);
        System.out.println(mid);
	}

}
