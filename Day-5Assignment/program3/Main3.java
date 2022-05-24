package com.te.program3;
import java.util.Scanner;
public class Main3 {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		String s=scanner.nextLine();
		int num=scanner.nextInt();
        String mid=UserCode3.formNewWord(s,num);
        System.out.println(mid);

	}

}
