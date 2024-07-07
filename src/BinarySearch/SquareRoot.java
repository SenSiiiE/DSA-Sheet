package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(17));
    }

    static int sqrt(int num){
        if(num == 0 || num == 1) return num;

        int s = 0;
        int e = num;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(mid != 0 && mid == num / mid){
                return mid;
            }else if(mid != 0 && mid > num / mid){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        return e;
    }
}
