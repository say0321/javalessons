import java.util.*;
public class Cleric{
	String name;
	int hp;
	int mp;
	final int MAX_HP=50;
	final int MAX_MP=10;
	void selfAid(){
		this.mp-=5;
		this.hp=MAX_HP;
	}
	public int pray(int sec){
		Random rand=new Random();
		int n=rand.nextInt(3);
		n=n+sec;
		this.mp+=n;
		if(this.mp>MAX_MP){
			n=this.mp-MAX_MP;
		}
		return n;
	}
}
