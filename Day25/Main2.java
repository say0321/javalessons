import my.util.*;
public class Main2{
	public static void main(String[]args){
		int a=Common.input("整数A>");
		int b=Common.input("整数B>");
		while(true){
			int select=Common.input("番号を入力1.和,2.差,3.積,4.最大公約数,5.終了>");
			if(select==1){
				Common.print(""+(a+b));
			}else if(select==2){
				Common.print(""+(a-b));
			}else if(select==3){
				Common.print(""+a*b);
			}else if(select==4){
				Common.print(""+Common.gcdOf(a,b));
			}else{
				break;
			}
		}
		Common.print("アプリを終了します。");
	}
}
