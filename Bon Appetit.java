import java.util.Scanner;

class Solution{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int k = scan.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        
        String result = Bill(arr,k,n,b);
        System.out.println(result);
    }
    static String Bill(int []arr,int k,int n,int b){
            int sum = 0;
            for(int i =0; i<n; i++){
                sum = sum+ arr[i];
            }
            sum = sum - arr[k];
            if(sum == b*2){
                return "Bon Appetit";
            }
            return Integer.toString(b-sum/2);
    }
}
			
		