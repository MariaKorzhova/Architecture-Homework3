// авто с дизельным двигателем
public class DieselCar extends Car{
    public DieselCar(String brand, String model, String color, String bodyType, String gearboxType, int numberOfWheels, double engineSize){
        super(brand, model, color, bodyType, "diesel", gearboxType, numberOfWheels, engineSize);
               }

    @Override
    protected void changeGear() {
        super.changeGear();
    }

    @Override
    protected void headlightsOn() {
        super.headlightsOn();
    }

    @Override
    protected void movement() {
        super.movement();
    }

    @Override
    protected void service() {
        super.service();
    }

    @Override
    protected void wipersOn() {
        super.wipersOn();
    }

    public void refueling() {
        System.out.println(model + " топливо - дизель");
    }
               
}
