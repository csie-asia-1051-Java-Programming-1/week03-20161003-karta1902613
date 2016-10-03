package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex03_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int v1 = ch-'a';
		if (v1>=0&&v1<26){
			int x =ch-32;
			System.out.print((char)x);}
		else{
			int x =ch+32;
			System.out.print((char)x);}}}
	

