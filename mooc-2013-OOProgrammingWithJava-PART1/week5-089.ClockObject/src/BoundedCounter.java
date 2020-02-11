
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit, int value){
        this.upperLimit = upperLimit;
        this.value = value;
    }
    
    public void next(){
        if(this.value<this.upperLimit){
            this.value++;
        } else {
            this.value = 0;
        }
    }
    
    public String toString() {
        if(this.value<=9){
            return "0"+value;
        } else {
            return ""+value;
        } 
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int newValue){
        if (newValue>=0 && newValue<=this.upperLimit){
            this.value = newValue;
        }
    }
    
    
} 

