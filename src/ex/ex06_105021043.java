package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex06_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("x=");
		int x = scn.nextInt();
		if(x<-1){
			int y =3*x*x;
			System.out.print("y="+y);}
		else if(x>=-1&&x<=1){
			int y =x*x*x+3*x-3;
			System.out.print("y="+y);}
		else if(x>1){
			int y =2*x+3;
			System.out.print("y="+y);}}}

