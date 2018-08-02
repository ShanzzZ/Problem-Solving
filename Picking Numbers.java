import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]s = new int[n];
		for(int i=0; i<n; i++)
			s[i] = scan.nextInt();
		int result = Pick(s,n);
		System.out.println(result);
	}
	static int Pick(int[]s, int n) {
		int count=0;
		int[]ar = new int[105];
		for(int i=0; i<n; i++){
			ar[s[i]]++;
		}
		for(int i=0;i<=100;i++){
			count = Math.max(count, ar[i] + ar[i+1]);
		}
		return count;
	}
}
		
			