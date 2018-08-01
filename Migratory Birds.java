import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []ar = new int[n];
        for(int i =0; i<n;i++)
            ar[i] = scan.nextInt();
        scan.close();
        int result = Birds(n,ar);
        System.out.println(result);
    }
    
    static int Birds(int n, int[] ar) {
        int count[] = new int[6];
        int result = 1; int max = 0;
        for (int i = 0; i < n; i++) {
            count[ar[i]]++;
        }
        for (int i = 1; i <= 5; i++) {
            if (count[i] > max) {
                result = i;
                max = count[i];
            }
        }

        return result;
    }
/*
 *static int Birds(int[]ar,int n){
		int count=0; int sum=0;int temp;
		for(int i=0; i<n;i++){
			for(int j=i+1;j<n;j++){
			if(ar[i] == ar[j]){
			count++;
			if(count>sum)
		    temp = ar[i];
		    }
		    }
		    sum = count;
		}
		return temp;
	}
*/
}
		    
