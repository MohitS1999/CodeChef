import java.util.*;
import java.lang.*;
import java.io.*;
class STRNO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    if((k==1)||(k==0))
		        System.out.println("1");
		    else{
		        if (count(n)>=k)
		            System.out.println("1");
		        else{
		            System.out.println("0");
		        }
		    }
		}
	}
	public static int count(int n){
	    int cnt=0;
	   
	    for(int i=2;i*i<=n;i++){
	        while(n%i==0){
	            cnt++;
	            n/=i;
				System.out.println(n+"COUNT"+cnt);
	        }
	    }
	    if(n>2)
	        cnt++;
	    return cnt;
	}
}
