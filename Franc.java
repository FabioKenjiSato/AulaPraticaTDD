class Franc extends Money {   
    
    Franc(int amount) {      
       this.amount = amount;
    }
    
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
    
    // equals foi movido para Money, nao e' mais necessario aqui
}