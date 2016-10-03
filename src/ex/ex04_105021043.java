package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex04_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int sum =0;
				while(n>0){
					sum+=n%10;
					n/=10;}
				System.out.println(sum);}}
