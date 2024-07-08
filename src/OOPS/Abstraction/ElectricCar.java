package OOPS.Abstraction;

public class ElectricCar implements Car{
    public void run(){
        System.out.println("Electric Car is running!");
    }

    public void horn() {
        System.out.println("Electric Car is Honking!");
    }
}
