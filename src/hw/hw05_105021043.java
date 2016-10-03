package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */
public class hw05_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int sum=0;
		int n =scn.nextInt();
		int i =0;
		while(i<n){
			i++;
			sum+=i*(i+1);}
		System.out.println(sum);}}


