import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("体重(kg)>");
double num=sc.nextDouble();
		System.out.print("身長(cm)>");
double num1=sc.nextDouble();
num1=num1/100;
double num2=num/(num1*num1);
System.out.printf("あなたのBMIは%.2fです。",num2);
	}
}
