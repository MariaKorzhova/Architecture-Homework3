// класс автомобиля с имплементацией интерфейса iGasStation
public class Mercedes extends Car implements iGasStation{
    public Mercedes(String model, String color, String bodyType, String gearboxType,String fuelType,
                    int numberOfWheels,
                    double engineSize) {
        super("Mercedes", model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
    
    public void refueling() {
        
    }

    public void windshieldCleaning() {

    }

    public void headlightCleaning() {
        
    }

    public void mirrorCleaning() {
        
    }


}
