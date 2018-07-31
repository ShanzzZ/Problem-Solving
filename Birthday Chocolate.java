import java.util.Scanner;

public class Solution {

    static int BirthChoc(int n, int[] s, int d, int m){

        int count = 0;
        int sum = 0;
        for(int i = 0; i <= (s.length - m); i++) {
            sum = 0;
            for(int j = i; j < (i + m); j++) {//length of segment equals to month
                sum += s[j];
            }
            if(sum == d) {
                count++;
            }
        }       
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]s = new int[n];
        for(int i =0; i<n;i++){
        s[i] = scan.nextInt();
        }
        int d = scan.nextInt(); int m = scan.nextInt();
        scan.close();
        int result = BirthChoc(n,s,d,m);
        System.out.println(result);
    }
}