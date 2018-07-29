import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution {
    static String timeConversion(String s) throws ParseException {

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");//12Hour Format
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");//24Hour Format

        return date24Format.format(date12Format.parse(s));
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
		