import java.util.*;
public class Main2{
	public static void main(String[]args){
		Random rand=new Random();
		int a=10;
		int b=5;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a:"+a+"b:"+b);
		String[] fortunes={"大吉","中吉","吉","凶"};	
		int index=rand.nextInt(fortunes.length);
		System.out.println("本日の運勢は"+fortunes[index]);
	}
}
