import java.util.Scanner

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); int k = scan.nextInt();
	    int []ar = new int[];
	    for(int i=0; i<n; i++){
	    	ar[i] = scan.nextInt();
	    }
	    scan.close();
	    int result = Divisible(ar,n,k);
	    System.out.println(result);
	}
	static int Divisible(int[]ar,int n,int k){
		int count=0;
		for(int i=0; i<n; i++){
			for(int j=i+1;j<n;j++)
			if((ar[i]+ar[j])%k==0)
			count++;
		}
		
		return count;
	}
}
		
		