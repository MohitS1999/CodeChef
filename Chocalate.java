import java.util.*;
public class Chocalate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int totamt=sc.nextInt();
            int price=sc.nextInt();
            int wrap=sc.nextInt();
            int candy=totamt/price;
			System.out.println(candy);
            int count=candy;
			System.out.println(count);
                while(candy>=wrap){
                    int p=0;
                    p=candy/wrap;
					System.out.println(p);
                    count+=p;
                    candy=p+candy%wrap;
                }
            System.out.println(count);
            
        }
    }
}