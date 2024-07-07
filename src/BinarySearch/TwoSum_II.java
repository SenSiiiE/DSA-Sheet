package BinarySearch;

import java.util.Arrays;

public class TwoSum_II {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        System.out.println(Arrays.toString(TwoSum2(a, 9)));
    }

    public static int[] TwoSum2(int[] a, int target){
        int s = 0;
        int e = a.length - 1;

        while(s < e){
            if(a[s] + a[e] == target){
                return new int[] {s + 1, e + 1};
            }else if(a[s] + a[e] < target){
                s++;
            }else{
                e--;
            }
        }

        return new int[]{-1,-1};
    }
}
