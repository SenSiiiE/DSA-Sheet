package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        StudentClass vikash = new StudentClass("Vikash", 22, 12);
        StudentClass mayank = new StudentClass();

        System.out.println(vikash.getName());
        System.out.println(mayank.getAge());
    }
}
