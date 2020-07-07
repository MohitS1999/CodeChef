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
			boolean fail=false;
			for(int i=0;i<n;i++){
				int T=sc.nextInt();
				int x=sc.nextInt();
				if(!fail){
					if(T==1){
						if((h-y1)<=x||h<=x) cnt++;
						else{
							if(l>0) cnt++;
							l--;
							if(l==0){
								fail=true;
								cnt--;
							}	
						}
						if(T==2){
							if(y2>=x) cnt++;
							else{
								if(l>0) cnt++;
								l--;
								if(l==0){
									fail=true;
									cnt--;
								}
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}	
}
