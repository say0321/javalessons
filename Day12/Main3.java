import java.util.*;
public class Main3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何日分のデータを入力しますか>");
		int days=sc.nextInt();
		double[] weights=new double[days];
		double sum=0;
		for(int i=0;i<weights.length;i++){
			System.out.print(i+1+"日目:");
			weights[i]=sc.nextDouble();
			sum+=weights[i];
		}
		//System.out.println(Arrays.toString(weights));
		System.out.println("体重結果");
		double min=weights[0];
		for(int i=0;i<weights.length;i++){
			System.out.println(i+1+"日目["+weights[i]+"]");
			if(weights[i]>min){
				min=weights[i];
			}
		}
		min-=2;
		double ave=sum/weights.length;
		System.out.printf("平均[%.1f]%n",ave);
		System.out.println("目標["+min+"]");
	}
}
