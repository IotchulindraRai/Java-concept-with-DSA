import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
 int longest = arr[0];
 for(int i=0;i<n;i++){
if(arr[i] > longest){
    longest =arr[i];
}
 }
 return longest;
    }
}
