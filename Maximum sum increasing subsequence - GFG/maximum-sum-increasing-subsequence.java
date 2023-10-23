//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	     // Your code goes here
	    int dp[] = new int[n];
	    
	    int omax = Integer.MIN_VALUE;
	    
	    for(int i=0;i<dp.length;i++){
	        Integer max = null;
	        
	        for(int j=0;j<i;j++){
	            if(arr[j]<arr[i]){
	                if(max==null)
	                 max = dp[j];
	                else if(dp[j]>max)
	                 max = dp[j];
	            }
	        }
	        
	         if(max==null)
	         dp[i] = arr[i];
	        else
	         dp[i] = max + arr[i];
	         
	         if(dp[i]>omax)
	          omax = dp[i];
	    }
	      return omax;    
	}  
}