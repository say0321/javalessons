import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		System.out.println("1~100の番号を決めたよ当ててね");
	    int answer=ra.nextInt(100)+1;
		int count=0;
		int userAns;
		int max=5;
		do{
			System.out.print("いくつかな>");
			count++;
			userAns=sc.nextInt();
			if(answer<userAns&&count<max){
				System.out.println("もっと下だよ");
			}else if(answer>userAns&&count<max){
				System.out.println("もっと上だよ");
			}else if(answer!=userAns&&count==max){
				System.out.println("残念～正解は"+answer+"でした。");
			}else if(answer==userAns){
				System.out.println("当たり！");	
				break;
			}
		}while(count<max);
	}
}
