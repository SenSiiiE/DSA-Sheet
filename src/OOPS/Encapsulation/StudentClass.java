package OOPS.Encapsulation;

public class StudentClass {
    private String name;
    private int age;
    private int rollno;

    StudentClass(){
        this.name = "NA";
        this.age = 10;
        this.rollno = 0;
    }

    StudentClass(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getRollno(){
        return this.rollno;
    }
}
