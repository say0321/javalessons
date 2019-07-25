import java.util.*;
public class Main{
	public static void main(String[]args){
		Random rand=new Random();
		int[] dice=new int[10];
		for(int i=0;i<dice.length;i++){
			int x=rand.nextInt(6)+1;
			dice[i]=x;
		}
		System.out.println(Arrays.toString(dice));
	}
}
