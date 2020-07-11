import java.util.*;
public class ThePromised{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int s=sc.nextInt();
		int x[]=new int[X];
		int y[]=new int[Y];
		for(int i=0;i<X;i++){
			x[i]=sc.nextInt();
		}
		for(int i=0;i<Y;i++){
		y[i]=sc.nextInt();
		}
		int m=0,p=0,n1,n2,n3,n4;
		for(int i=0;i<=Y;i++){
			int n=0;
			if(i<Y){
				n1=y[i]-(m+1);
				n3=n1%s;
				n1=n1-n3;
				for(int j=0;j<=X;j++){
					if(j<X){
						n2=x[j]-(n+1);
					//	System.out.println(n);
					//	System.out.println(n2);
						n4=(n2%s);
						n2=n2-n4;
						p+=n1*n2;
					//	System.out.println("if y if x...."+p);
						n=x[j];
					}
					else if(j==X){
						n2=N-x[j-1];
						n4=(n2%s);
						n2=n2-n4;
						p+=n1*n2;
					}
				}
				m=y[i];
			}
			else if(i==Y){
				n1=M-y[i-1];
				n3=(n1%s);
				n1=n1-n3;
				for(int j=0;j<=X;j++){
					if(j<X){
						n2=x[j]-(n+1);
						n4=n2%s;
						n2=n2-n4;
						p+=n1*n2;
						n=x[j];
					}
					else if(j==X){
						n2=N-x[j-1];
						n4=(n2%s);
						n2=n2-n4;
						p+=n1*n2;
					}
				}
			}
		}
		//System.out.println(p);
		p=p/(s*s);
		System.out.println(p);
	}
}
