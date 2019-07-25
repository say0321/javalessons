import java.util.*;
public class Main{
	public static void main(String[]args){
		Random ra=new Random();
		Scanner sr=new Scanner(System.in);
		System.out.print("名前を入れてください>");
		String name=sr.nextLine();
		int ja=ra.nextInt(3)+1;
		String jan;
		if(ja==1){
		jan="グー";
		}else if(ja==2){
			jan="チョキ";
		}else{
			jan="パー";
		}
		System.out.printf("%sは%sを出しました。",name,jan);
		if(ja==1){
			System.out.println("本田圭佑はパーを出しました");
			System.out.println("本田圭佑「俺の勝ち！なんで負けたか明日までに考えといてください。」");
		}else if(ja==2){
			System.out.println("本田圭佑はグーを出しました");
			System.out.println("本田圭佑「俺の勝ち！なんで負けたか明日までに考えといてください。」");
			}else{
			System.out.println("本田圭佑はチョキを出しました");
			System.out.println("本田圭佑「俺の勝ち！なんで負けたか明日までに考えといてください。」");

			}
		}
	}

