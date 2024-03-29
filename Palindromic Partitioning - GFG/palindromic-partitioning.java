//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int n = str.length();
        int arr[] = new int[n+1];
        arr[0] = 0;
        
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j>=0;j--){
                if(isPallindrome(j,i,str))
                {
                    int res = 1+arr[j];
                    min = Math.min(res,min);
                }
            }
            
            arr[i+1] = min;
        }
        
        return arr[n]-1;
    }
    
    static boolean isPallindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
             return false;
             
             i++;j--;
        }
        
        return true;
    }
}