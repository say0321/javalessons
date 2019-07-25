import java.util.*;
public class Main12{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[3];
		System.out.print("整数を3個入力>");
		for(int i=0;i<3;i++){
			array[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(newArray(array)));
	}
	public static int[] newArray(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]*=2;
		}
		return array;
	}
}
