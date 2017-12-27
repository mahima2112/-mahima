public class Knapsack {
public static int knapSack(int maxWeight, int wt[], int val[], int n)
	      {
	           int i, w;
	       int K[][] = new int[n+1][maxWeight+1];
	        
	       // Create array K[][] (2 dimensional)
	       
	       for (i = 0; i <= n; i++)
	       {
	           for (w = 0; w <= maxWeight; w++)
	           {
	               if (i==0 || w==0)
	                    K[i][w] = 0;
	               else if (wt[i-1] <= w)
	                     K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
	               else
	                     K[i][w] = K[i-1][w];
	           }
	        }
	        
	        return K[n][maxWeight];
	  }
	
	
		public static void main(String[] args) {

			int wt[] = { 6, 1, 2, 4, 5 };
			int val[] = { 10, 5, 4, 8, 6 };
			int maxWeight = 5;
			int n=3;
			System.out.println(knapSack(maxWeight, wt, val, n));
	}

