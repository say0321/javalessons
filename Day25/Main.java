import my.util.*;
public class Main{
	public static void main(String[]args){
		int a=Common.input("整数A>");
		int b=Common.input("整数B>");
		System.out.printf("合計は%d%Sです%n",a+b,(a+b)%2==0?"偶数":"奇数");
	}
}
