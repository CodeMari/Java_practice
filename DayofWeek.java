import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Calendar; 

public class DayofWeek {
    static List<String>days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    public static String findDay(int month, int day, int year){
        int m = Integer.parseInt(month); 
        int d = Integer.parseInt(day); 
        int y = Integer.parseInt(year); 
        
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d);

        int p = c.get(Calendar.DAY_OF_WEEK); 
        String s = days.get(p-1);
        return s;


    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 

        String month = sc.next(); 
        String day = sc.next(); 
        String year = sc.next(); 

        System.out.println(getDay(dsay, month, year)); 
    }
}