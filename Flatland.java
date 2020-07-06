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
			//System.out.println("I  "+i);
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
				
                if (Math.abs(i-a[j])<=min){
					//System.out.println("--"+a[j]);
					//System.out.println("abs--"+Math.abs(i-a[j]));
                    min=Math.abs(i-a[j]);
					//System.out.println("min "+min);
					
                }
            }
			//System.out.println("min---"+min);
            if (min>max){
				max=min;
			}
        }
        System.out.println(max);
    }
}