// kareem amr hassen
// 20216746

import java.util.*;
public class first{
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int x = sc.nextInt();
        if(x == 0 && x == 1) flag = false;
        else{
            for (int i = 2; i <= x / 2; ++i) {
                // condition for nonprime number
                if (x % i == 0) {
                    flag = false;
                }else flag= true;
              }
        }
            if(flag) System.out.println(x+" is a prime number ");
            else System.out.println(x+" is not a prime number ");
        
    }
}
