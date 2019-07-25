import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数a>");
		int a=sc.nextInt();
		System.out.print("整数b>");
		int b=sc.nextInt();
		int c=a+b;
		System.out.printf("%dと%dを足すと%dです。%n次に整数aと整数bの間にある偶数を表示します%n",a,b,c);
		int d=0;
		if(a<b){
			d=b/2*2;
			while(d>=a){
				System.out.println(d);
				d-=2;
			}
		}else if(a>b){
			d=a/2*2;
			while(d>=b){
				System.out.println(d);
				d-=2;
			}
			}else{
				System.out.println("なし");
			}
	}
}

