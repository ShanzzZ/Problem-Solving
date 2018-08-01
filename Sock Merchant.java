import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = scan.nextInt();
        scan.close();
        int result = SockPair(ar,n);
        System.out.println(result);
    }
    
    static int SockPair(int[]ar,int n){
        Arrays.sort(ar);//place the elements in order
        int pairs=0;
        for(int i=0;i<n-1;i++){
        if(ar[i]==ar[i+1]){
            ++pairs;
            ++i;
        }
    }
        return pairs;
    }
}

