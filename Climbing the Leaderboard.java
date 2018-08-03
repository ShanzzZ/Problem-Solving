class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]s = new int[n];
        for(int i=0; i<n; i++)
            s[i] = scan.nextInt();
        int m = scan.nextInt();
        int[]a = new int[m];
        for(int i=0; i<m; i++)
            a[i] = scan.nextInt();
        scan.close();
        
        int[]result = Climbing(s,a);
        for(int k=0; k<m; k++)
        System.out.println(result[k]);
    }
    
    static int[] Climbing(int[]s, int[]a){
    int ar[] = new int[a.length];
    int rank = 1;
    int rankScore = s[0];
    for (int x=a.length - 1,y=0; x>=0; x--) {
    if (a[x] < rankScore) {
        for (; y< s.length; y++) {
            if (s[y] < rankScore) {
                rank++;
                rankScore = s[y];
            }                
            if(a[x] >= s[y]) break;
        }
    }

    ar[x] = y == s.length ? rank + 1 : rank;
}
    return ar;
    }
}
			
			
			