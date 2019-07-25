import java.util.*;
public class MethodLesson4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("消費税は何%ですか>");
		double n=sc.nextDouble();
		int sum=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int num=sc.nextInt();
			if(num==0){
				break;
			}
			sum+=num;
		}
		sum=buy(n,sum);
		System.out.println("お買い物合計は"+sum+"円(税込み)です。");
	}
	static int buy(double n,int num){
		double a=num*(n/100+1);
		return (int)a;
	}
}
