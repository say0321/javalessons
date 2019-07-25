public class Main2{
	public static void main(String[]args){
		int n1=0;
		int n2=1;
		int sum=0;
		while(true){
			n1=n2;
			n2=sum;
			sum=n1+n2;
			if(n2<1000){
			System.out.print(n2+" ");
			}else
				break;
		}
	}
}
