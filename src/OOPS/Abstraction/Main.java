package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car electric = new ElectricCar();
        Car petrol = new PetrolCar();

        electric.run();
        electric.horn();
        petrol.run();
        petrol.horn();
    }
}
