import java.util.Scanner;

class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int p = scan.nextInt();
        scan.close();
        int result = Drawing(n,p);
        System.out.println(result);
    }
    static int Drawing(int n,int p){
        int front=0; int back=0;
        for(int i=1; i<n; i++){
            if(p==1) front=0;
            if(p>=i*2 || p>=i*2+1)
            front++;
        }
        for(int i=n; i>0; i--){
            if(p==n ||p==n-1) back=0;
            if(p<i-2 || p<i-3)
            back++;
        }
        if(front<back) return front;
        return back;
    }
}
    static int solve(int n, int p) {
    	int page1 = Math.abs(p/2);
    	if(n%2==0){
        n++;
        }
        int page2 = Math.abs((p - (n))/2);
        return page1 < page2 ? page1 : page2;
}
		