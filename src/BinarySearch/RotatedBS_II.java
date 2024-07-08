package BinarySearch;

public class RotatedBS_II {
    public static void main(String[] args) {
        int[] a = {3,3,3,1,2,3,3,3,3,3,3,3};
        System.out.println(binarySearch(a, 1));
    }
    static boolean binarySearch(int[] a, int target){
        int s = 0;
        int e = a.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(a[mid] == target) return true;
            if(a[s] == a[mid] && a[mid] == a[e]){
                s++;
                e--;
                continue;
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
        return false;
    }
}
