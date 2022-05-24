package com.te.program4;
import java.util.Scanner;
public class Main4 {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		String s=scanner.nextLine();
        String mid=UserCode4.removeEvenVowels(s);
        System.out.println(mid.toString());

	}

}
