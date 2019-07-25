import java.util.*;
public class MethodLesson8{
	static int[] makeArrFirstToLast(int first,int last){
		int[] retArr=new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			if(first<last){
				retArr[i]=first+i;
			}else{
				retArr[i]=first-i;
			}
		}
		return retArr;
	}
	public static void main(String[]args){
		int[] arr=makeArrFirstToLast(4,-2);
		System.out.println(Arrays.toString(arr));
	}
}
