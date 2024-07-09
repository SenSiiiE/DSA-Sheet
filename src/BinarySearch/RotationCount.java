package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] a = {7,8,9,1,2,3,4,5,6};
        System.out.println(count(a));
    }

    static int count(int[] a){
        int s = 0;
        int e = a.length - 1;
        int index = -1;
        int min = Integer.MAX_VALUE;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(a[s] <= a[mid]){
                if(a[s] < min){
                    min = a[s];
                    index = s;
                }
                s = mid + 1;
            }else{
                if(a[mid] < min){
                    min = a[mid];
                    index = mid;
                }
                e = mid - 1;
            }
        }
        return index;
    }
}
