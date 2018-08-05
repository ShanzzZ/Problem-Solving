import java util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int result = Ad(n);
        System.out.println(result);
    }
    static int Ad(int n){
        int p = 5; int sum = 0;
        for(int i=0;i<n;i++){
            p = p/2;
            sum +=p;
            p*=3;
        }
        return sum;
    }
}