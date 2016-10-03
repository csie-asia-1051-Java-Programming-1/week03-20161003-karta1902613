package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw02_105021043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x = 0 ;
		int y = 0 ;
		int z = 0 ;
		char check;
		while(true){
			int n = scn.nextInt();
			if (n >0)     {x++;}
			else if(n<0)  {y++;}
			else if(n==0) {z++;}
		
			System.out.println("是否繼續(y/n)");
			
			check = scn.next().charAt(0);
			if(check == 'y'||check == 'Y'){
				continue;}
			else{
				break;}}
		System.out.print(x+"個正數");
		System.out.print(z+"個負數");
		System.out.print(y+"個零");}}