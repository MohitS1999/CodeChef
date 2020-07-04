import java.util.*;
public class FactorialCode{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int mul=0;
			int n=sc.nextInt();
			int a=5;
			while(n/a>0){
				mul+=n/a;
				a*=5;
			}
			System.out.println("---"+mul);
		}
	}
}