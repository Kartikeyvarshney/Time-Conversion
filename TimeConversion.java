import java.util.Scanner;

class Result {

    public static String timeConversion(String s)
    {
    // Write your code here
        String AmPm = s.substring(s.length()-2);
        int hour = Integer.parseInt(s.substring(0,2));
        int minutes = Integer.parseInt(s.substring(3,5));
        int second = Integer.parseInt(s.substring(6,8));
        if (AmPm.equals("PM") && hour != 12)
        {
            hour = hour +12;
        }
        else if ( hour == 12 && AmPm.equals("AM"))
        {
            hour = 0;
        }
        // System.out.println(hour);
        String time = (hour<10 ? "0":"")+ hour+":"+(minutes<10 ? "0":"")+minutes+":"+(second<10 ? "0":"")+second;
        return time;
    }

}

public class Solution {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Result.timeConversion(s));
    }
}
