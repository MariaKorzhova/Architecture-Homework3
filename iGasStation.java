// Интерфейс с методами заправочной станции: заправка, протирка лобового стекла, протирка фар, протирка зеркал.
public interface iGasStation {
    void refueling();
    void windshieldCleaning();
    void headlightCleaning();
    void mirrorCleaning();
}
