package Temperature;

public interface Sensor {
    boolean isOn();
    void on();
    void off();
    int measure();    
}
