import java.util.*;
public class COVID19{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int cnt=1;
			//Maximum
			int max=Integer.MIN_VALUE;
			//Minimum
			int min=Integer.MAX_VALUE;
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int j=0;
			for(int i=0;i<n-1;i++)
			{
				//System.out.println(y-x);	
				if (a[i+1]-a[i]<=2)
					cnt++;
				else{
					b[j]=cnt;
					cnt=1;
					j++;
				}
			}
			b[j]=cnt;
			System.out.print(min(b)+" "+max(b));
		}
	}
	static int max(int a[]){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>max)
				max=a[i];
		}
		return max;
	}
	static int min(int a[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]<min && a[i]!=0)
				min=a[i];
		}
		return min;
	}
}
