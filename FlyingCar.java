// класс автомобиля с методом движения - полёт
public class FlyingCar extends Car{
    public FlyingCar(String brand, String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
    @Override
    public void movement(){
        System.out.println("Летающий автомобиль");
    }
}
