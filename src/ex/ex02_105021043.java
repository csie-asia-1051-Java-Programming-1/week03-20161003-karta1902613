package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex02_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int v1 = ch-'a';
		if (v1>=0&&v1<26){
			System.out.print("小寫");	}
		else{
			System.out.print("大寫");}}}