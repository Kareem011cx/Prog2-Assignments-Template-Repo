// kareem amr hassen
//20216746
import java.util.*;
public class first{
    public static void main(String[]args){
        System.out.println("choose the size of array :");
        Scanner sc=new Scanner(System.in);
        int length;
        length=sc.nextInt();    
        int [] arr = new int[length];   
        System.out.println("insert numbers in the arrau :"); 
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();    
        }
        for(int i=0;i<length;i++){   
            if(arr[i] > 0) arr[i] = 1;//positive num
            else if(arr[i] < 0) arr[i] = 2;//negative num 
            else arr[i] = 0;  
        }
        for(int i=0 ; i < length ; i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
