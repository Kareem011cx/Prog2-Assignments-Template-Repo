// kareem amr hassen
//20216746
import java.util.*;
public class first{
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x,y,sum=0;
        x = sc.nextInt();//4
        y = sc.nextInt();//5
        if(x%2 != 0){
            for(int i=1 ; i <= y ;i++){
                System.out.print(x+"+");
                sum = sum + x;
                x = x+2;
            }
        }else{
            x = x+1;
            for(int i=1 ; i <= y ;i++){
                System.out.print(x+"+");
                sum = sum + x;
                x = x+2;
            }
        }
        System.out.println("\n"+sum);
	}
}
