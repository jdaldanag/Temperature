package Temperature;
import java.util.*;

public class Thermometer implements Sensor {
    private boolean state;
    
    public Thermometer(){
        this.state = false;
    }
        
    public boolean isOn(){
        return this.state;
    }
        
    public void on(){
        this.state = true;
    }
    
    public void off() { }
    
    public int measure(){
        if(this.state){
            Random rand = new Random();
            return rand.nextInt(60)- 30;
        }else{
            throw new IllegalStateException("Wrong");
        }
    }
}
