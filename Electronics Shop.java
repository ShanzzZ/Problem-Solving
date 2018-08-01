import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt(); int n = scan.nextInt();
		int m = scan.nextInt();
		int[]k = new int[n]; int[]d = new int[m];
		for(int i=0; i<n; i++)
			k[i] = scan.nextInt();
		for(int i=0; i<m; i++)
			d[i] = scan.nextInt();
		scan.close();
		
		int result = Shopping(k,d,b.n.m);
		System.out.println(result);
		
	}
	static int Shopping(int[]k, int[]d, int b, int n, int m){
		int sum=-1;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++)
				if(k[i]+d[j]<=b && k[i]+d[j]>sum)
					sum=k[i]+d[j];
		}
		return sum;
	}
}
		
			