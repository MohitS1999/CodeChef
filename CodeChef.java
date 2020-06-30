import java.util.*;
class FullBarier{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int h=sc.nextInt();
			int y1=sc.nextInt();
			int y2=sc.nextInt();
			int l=sc.nextInt();
			int cnt=0;
			for(int i=0;i<n;i++){
				int T=sc.nextInt();
				int x=sc.nextInt();
				if(T==1&&l>0){
					if((h-y1)<=x){
						cnt++;
				}else{
					cnt++;
					l--;
				}
				if(T==2&&l>0){
					if(y2<=x){
						cnt++;
					}else{
						cnt++;
						l--;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}