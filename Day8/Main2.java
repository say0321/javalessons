import java.util.*;
public class Main2{
	public static void main(String[]ages){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数>");
		int num=sc.nextInt();
		int count=0;
		String three="Fizz";
		String five="Buzz";
		while(num>count){
			count++;
			if(count%3==0&&count%5==0){
				System.out.println(three+five);
			}else if(count%3==0){
				System.out.println(three);
			}else if(count%5==0){
				System.out.println(five);
			}else{
				System.out.println(count);
			}
		}
	}
}
