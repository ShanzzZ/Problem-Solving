import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][][] PossibleSquare = {
        	{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        	{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
        	{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
        	{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        	{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        	{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},                    
        };

        int[][] s = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                s[i][j] = input.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int possible = 0; possible < 8; possible++) 
        {
            int cost = 0;
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++)
                    cost += Math.abs(s[i][j] - PossibleSquare[possible][i][j]);
            }
            minCost = Math.min(minCost, cost);
        }
        System.out.println(minCost);
    }
}
			