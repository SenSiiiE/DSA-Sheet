package BinarySearch;

public class PeakElement_I {
    public static void main(String[] args) {

    }

    static int peakElement(int[] a, int n){

        if(n == 1) return a[0];
        if(a[0] > a[1]) return a[0];
        if(a[n - 1] > a[n - 2]) return a[n - 1];

        int s = 0;
        int e = a.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(a[mid] > a[mid - 1] && a[mid] > a[mid + 1]){
                return a[mid];
            }else if(a[mid - 1] < a[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
    }
}
