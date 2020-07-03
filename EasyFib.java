import java.util.Scanner;
public class EasyFib{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		long fib[]=new long[90];
		fib[0]=0L;
		fib[1]=1L;
		//if we want %10 of fibonacci series then after the 60 numbers all the series repeat again
		for (int i=2;i<90;i++){
			fib[i]=(fib[i-1]+fib[i-2]);
		}
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=1;
			while(p*2<=n){
				p*=2;
				System.out.println("p  "+p);
			}
			System.out.println(fib[p%60-1]);
		}
	}
}
