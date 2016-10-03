package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */
public class hw03_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int sum = 1;
		for(int i=n;i>0;i--){
			sum*=i;}
		System.out.print(sum);}}
