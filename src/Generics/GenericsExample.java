package Generics;

public class GenericsExample {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        String[] b = {"a", "b", "c"};
        printArray(b);
    }

    static <T> void printArray(T[] a){
        for (T element: a) {
            System.out.println(element);
        }
    }
}
