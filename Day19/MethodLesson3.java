import java.util.*;
public class MethodLesson3{
	static double calcBMI(double weightKg,double heightCm){
		double heightM=heightCm/100;
		return weightKg/(heightM*heightM);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double weight=sc.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=sc.nextDouble();
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。%n",weight,height,calcBMI(weight,height));
	}
}
