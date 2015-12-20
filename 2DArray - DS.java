import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int maxValue = -99999;
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i = 0; i <4; i++){
            for(int j = 0; j < 4; j++){
                int sum =0, sumTop =0, sumBot = 0, sumMed =0;
                sumTop = arr[i][j] + arr[i][j+1]+arr[i][j+2]; //getting sum of top 
                sumMed = arr[i+1][j+1];
                sumBot = arr[i+2][j] + arr[i+2][j+1]+arr[i+2][j+2];
                sum = sumTop+sumBot+sumMed;
                if(sum>maxValue) maxValue = sum;
            }
        }
      System.out.println(maxValue); 
    }
}