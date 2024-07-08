package BinarySearch;

public class UniqueElement {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(a));
    }

    static int singleNonDuplicate(int[] a){
        int s = 0, e = a.length - 1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(mid % 2 != 0){
                mid--;
            }

            if(a[mid] == a[mid + 1]){
                s = mid + 2;
            }else{
                e = mid;
            }
        }
        return a[e];
    }
}
