import java.util.Scanner;

class Solution{
	class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(); int n = scan.nextInt();
        int[]arr = new int[m]; int[]arr2 = new int[n];
        for(int i=0; i<m; i++)
            arr[i] = scan.nextInt();
        for(int i=0; i<n; i++)
            arr2[i] = scan.nextInt();
        int num = getTotalX(arr,arr2);
        System.out.println(num);
        
    }
    
    static int getTotalX(int[] a, int[] b) {
        int x=1,r=0,j=0,count=0;
        int[] d = new int[101];
        for(x=1;x<101;x++){
            int c=0;
            for(int i=0;i<a.length;i++) {
                    if(x%a[i]==0 && x>=a[i])
                        c++;
                    }      
                    if(c==a.length){
                    d[j]=x;
                    r++;
                    j++;
                }
                }
                
        for(j=0;j<r;j++){
            int c=0;
            for(int i=0;i<b.length;i++){
                if(b[i]%d[j]==0){
                    c++;
                }
            }
            if(c==b.length){
                count++;
            }
        }
        return count;
    }
    
}
			
			