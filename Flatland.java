import java.util.*;
public class Flatland{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
		
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
				
                if (Math.abs(i-a[j])<=min){
		
                    min=Math.abs(i-a[j]);
					
                }
            }
            if (min>max){
				max=min;
			}
        }
        System.out.println(max);
    }
}
