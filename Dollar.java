class Dollar extends Money {
   
   Dollar(int amount) {
      this.amount = amount;
   }
   
   Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
   }
   
   // equals foi movido para Money, nao e' mais necessario aqui
}