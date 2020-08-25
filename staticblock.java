package Java_practice;

import java.io.*;
import java.math.*; 
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6; 

public class staticblock {

  static  Scanner sc = new Scanner(System.in); 

    static int B= sc.nextInt(); 
    static int H= sc.nextInt();

    static boolean flag=true; 
    static{
        try{

    
    if(B<=0 || H<=0 )
        throw new Exception("Bredth and height must be poisitive");
        }catch{Exception e}{
            System.out.println(e);
            System.exit(0); 
        }
    }
    public static void main(String [] args){
        if(flag){
            int area = B*H; 
            System.out.print(area); 
        }
    }
}