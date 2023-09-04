//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    
    String chooseandswap(String A){
        // Code Here
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(int i=0;i<A.length();i++){
            if(!pq.contains(A.charAt(i)))
             pq.add(A.charAt(i));
        }
        
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            pq.remove(ch);
            if(!pq.isEmpty() && Character.compare(ch,pq.peek())>0){
                A = A.replace(ch,'*');
                A = A.replace(pq.peek(),ch);
                A = A.replace('*',pq.peek());
                break;
            }
        }
        
        return A;
    }
    
}