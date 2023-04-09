//kareem amr hassen
//20216746
import java.util.*;
public class first{
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n=0,f=1,x = sc.nextInt();//4
        int mr=x;//3
            for(int i=1; i<x+1 ;i++){
                while(f<mr){
                    System.out.print(" ");
                    f++;
                    //
                }while(n<i){
                System.out.print("*");
                n++;
                //
            }System.out.print("\n");
            n=0;
            f=1;
            mr--;
        }
    }
}
//I try hard to solve this but I cannot :(
