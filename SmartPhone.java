import java.util.*;
public class SmartPhone{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int max=0;
		for(int i=0;i<n;i++){
			int m=a[i]*(n-i);
			if(m>max)
				max=m;
		}
		System.out.println(max);
	}
}