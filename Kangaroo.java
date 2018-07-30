import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt(); int v1 = scan.nextInt();
        int x2 = scan.nextInt(); int v2 = scan.nextInt();
        String result = Kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
        
        static String Kangaroo(int x1, int v1, int x2, int v2){
            int dist = x1 - x2;
            int dv = v1 - v2;
          if ((dv * dist < 0) && (dist % dv == 0))
            return "YES";
        return "NO";
        }
}