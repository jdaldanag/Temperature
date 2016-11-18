package Temperature;
import java.util.*;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> reads;
    
    public AverageSensor(){ 
        sensors = new ArrayList<Sensor>();
        reads = new ArrayList<Integer>();
    }
    
    public boolean isOn(){
        for(Sensor x : this.sensors){
            if(x.isOn()){
                return true;
            }
        }    
        return false;    
    }
        
    public void on(){
        for(Sensor x : this.sensors){
            x.on();
        }
    }
    
    
    public void off() {
        for(Sensor x : this.sensors){
            x.off();
        }
    }
    
    public int measure(){
        if(this.sensors.isEmpty()|| this.isOn() == false){
            throw new IllegalStateException("wrong");
        }
        int sum = 0;        
        for (Sensor temper : this.sensors){
            sum += temper.measure();    
        }  
        int result = sum / sensors.size();
        reads.add(result);
        return result;
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return this.reads;
    }
}
