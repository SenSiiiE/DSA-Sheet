package OOPS.Abstraction;

public class PetrolCar implements Car{
    public void run(){
        System.out.println("Petrol car is running!");
    }

    public void horn() {
        System.out.println("Petrol car is honking!");
    }
}
