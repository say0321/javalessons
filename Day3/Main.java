public class Main{
	public static void main(String[] args){
	char c1='山';
        char c2='田';
        char c3='聖';
        char c4='也';
        int sum=c1+c2+c3+c4;
        int ave=sum/4;
        System.out.println("ポイントは"+sum+"平均は"+ave);
        System.out.println("山:"+(int)c1);
        System.out.println("田:"+(int)c2);
        System.out.println("聖:"+(int)c3);
        System.out.println("也:"+(int)c4);
        int max=Math.max(Math.max(c1,c2),Math.max(c3,c4));
        System.out.println("最強文字は:"+max+"powerです");
}
}
