class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h[] = new int[26];
        for (int i = 0; i < 26; i++)
            h[i] = scan.nextInt();
        String word = scan.next();
        scan.close();
        
        int result = PDFViewer(h,word);
        System.out.println(result);
        
    }
    static int PDFViewer(int[]h, String word){
        int max = 0;
        for (int i = 0; i < word.length(); i++){
            char temp = word.charAt(i);
            max = max < h[temp - 97] ? h[temp - 97] : max;
        }
        return max * word.length();

    }
}
			
				