package BinarySearch;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int[] b = {3,4,1,2,2};
        System.out.println(binarySearch(b));
    }

    static int binarySearch(int[] a){
        int s = 0;
        int e = a.length - 1;
        int min = Integer.MAX_VALUE;
        while(s <= e){
            int mid = s + (e - s) / 2;

            if(a[s] <= a[mid]){
                min = Math.min(min, a[s]);
                s = mid + 1;
            }else{
                min = Math.min(min, a[mid]);
                e = mid - 1;
            }

        }
        return min;
    }
}
