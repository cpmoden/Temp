
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added){
        int eurosPlus = this.euros;
        int centsPlus = this.cents;
        
        eurosPlus += added.euros;
        centsPlus += added.cents;
        if (centsPlus > 99) {
            eurosPlus += centsPlus / 100;
            centsPlus %= 100;
        }
        Money plus = new Money(eurosPlus, centsPlus);
        return plus;
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        else if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int eurosMinus = this.euros;
        int centsMinus = this.cents;
        
        eurosMinus -= decremented.euros;
        centsMinus -= decremented.cents;
        
        if (centsMinus < 0){
            eurosMinus--;
            centsMinus += 100;
        }
        
        if(eurosMinus < 0){
            eurosMinus = 0;
            centsMinus = 0;
        }
        
        else if (eurosMinus == 0 && centsMinus < 0){
            eurosMinus = 0;
            centsMinus = 0;
        }
        
        Money minus = new Money(eurosMinus, centsMinus);
        
        return minus;
        
    }
}
