package BinarySearch;

public class RotatedBS_I {
    public static void main(String[] args) {
        int[] a = {7,8,9,1,2,3,4,5,6};
        System.out.println(binarySearch(a, 6));
    }

    static int binarySearch(int[] a, int target){
        int s = 0;
        int e = a.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(a[mid] == target){
                return mid;
            }
            if(a[s] <= a[mid]){
                if(a[s] <= target && target <= a[mid]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }else{
                if(a[mid] <= target && target <= a[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
