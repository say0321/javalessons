import java.util.*;
public class MethodLesson9{
	public static void main(String[]args){
		Random rand=new Random();
		int num=rand.nextInt(10);
		System.out.printf("%dは%sです。",num,num%2==0?"奇数":"偶数");
	}
}
