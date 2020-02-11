
import java.util.Set;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(24, hoursAtBeginning);
        this.minutes = new BoundedCounter(60, minutesAtBeginning);
        this.seconds = new BoundedCounter(60, secondsAtBeginning);
       
    }
    
    public void tick() {
        int currentSeconds = this.seconds.getValue();
        int currentMinutes = this.minutes.getValue();
        int currentHours = this.hours.getValue();
        
        currentSeconds++;
        if(currentSeconds == 60){
            currentSeconds = 0;
           
            
            currentMinutes++;
            
            if(currentMinutes == 60){
                currentMinutes = 0;
                
                
                currentHours++;
                
                if(currentHours == 24){
                    currentHours = 00;
                }
            }
        }
        this.seconds.setValue(currentSeconds);
        this.minutes.setValue(currentMinutes);
        this.hours.setValue(currentHours);
        
    }
    
    public String toString() {
        
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
