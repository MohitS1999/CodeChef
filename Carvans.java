import java.util.*;
public class Carvans{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//testCases
		int t=sc.nextInt();
		while(t-->0){
			int c=1;
			int n=sc.nextInt();
			int x=sc.nextInt();
			int m=x;
			for(i=1;i<n;i++){
				if(x<m){
					m=x;
					c++
				}
			}
			System.out.println(c);
		}
	}
}
