import java.util.*;
public class Q2{
	public static void main(String[]args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		String[] hands={"グー","チョキ","パー"};
		System.out.println("ジャンケンゲーム!!");
		System.out.print("手を入力してね。 0:グー,1;チョキ,2;パー>");
		int userHand=sc.nextInt();
		int pcHand=rand.nextInt(3);
		System.out.println("あなたは"+hands[userHand]);
		System.out.println("PCは"+hands[pcHand]);
 		if(userHand==pcHand){
			System.out.println("引き分けです");
		}else if((userHand==0&&pcHand==1)||(userHand==1&&pcHand==2)||(userHand==2&&pcHand==0)){
			System.out.println("あなたの勝ちです");
		}else{
			System.out.println("あなたの負けです");
		}
	}
}

