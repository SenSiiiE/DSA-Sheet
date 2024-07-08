package BinarySearch;

public class NextGreatestChar {
    public static void main(String[] args) {
        char[] a = {'c', 'f', 'y', 'y'};

        System.out.println(nextChar(a, 'z'));
    }

    static char nextChar(char[] a, char target){
        int s = 0;
        int e = a.length - 1;

        while(s < e){
            int mid = s + (e - s) / 2;

            if(a[mid] == target){
                s = mid + 1;
            } else if (a[mid] > target) {
                e = mid - 1;
            }
        }

        return s > a.length - 1 ? a[0] : a[s];
    }
}
