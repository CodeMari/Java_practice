package Java_practice;
import java.util.Scanner; 

public class EOF {
    public static void main(String[] arags){
        Scanner sc = new Scanner(System.in); 

        String a;
        int i = 1; 
        while(sc.hasNext()){
            a=sc.nextLine(); 
            System.out.println(i+" "+a); 
            i++; 
        }
    }    
}