import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int k = scan.nextInt();
        int[]height = new int[n];
        for(int i=0; i<height.length;i++)
            height[i] = scan.nextInt();
        scan.close();
        int result = hurdle(height,n,k);
        System.out.println(result);
    }
    static int hurdle(int[]height, int n, int k){
        int max=0;
        for(int i=0; i<height.length;i++){
            if(max<height[i]) max = height[i];
        }
        return k>max?0:max-k;
    }
}