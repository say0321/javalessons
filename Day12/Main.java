public class Main{
	public static void main(String[]args){
		int[] arr={2,4,6,8,1,2,3,5,32,325,};
		System.out.println(arr[0]);
		arr[2]=10;
		arr[arr.length-1]=30;
		arr[arr.length-2]=10;
		int sum=0;
		for(int val:arr){
			sum+=val;
		}
		System.out.println(sum);
		double ave=(double)sum/arr.length;
		System.out.printf("%.1f%n",ave);
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("最大値は"+max);
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
		int idx=0;
		for(;idx<arr.length;idx++){
			if(arr[idx]==77){
				System.out.println("index"+idx+"に77がありました");
				break;
			}
		}
		if(idx==arr.length){
			System.out.println("77はありませんでした");
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}
