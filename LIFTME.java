import java.util.*;
public class LIFTME{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int q=sc.nextInt();
			int q1=sc.nextInt();
			int q2=sc.nextInt();
			int cur=0;
			long floor=0;
			floor+=Math.abs(q1-cur);
			floor+=Math.abs(q2-q1);
			for(int i=1;i<q;i++){
				cur=q2;
				q1=sc.nextInt();
				q2=sc.nextInt();
				floor+=Math.abs(q1-cur);
				floor+=Math.abs(q2-q1);
			}
			System.out.println(floor);
		}
	}
}