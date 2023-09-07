// автомобиль с тремя колёсами
public class ThreeWheels extends Car{
    public ThreeWheels(String brand, String model, String color, String bodyType, String fuelType, String gearboxType, double engineSize) {
        super(brand, model, color, bodyType, fuelType, gearboxType, 3, engineSize);
        }
    
    public int getNumberOfWheels(){
        return this.numberOfWheels;
        }
    }
