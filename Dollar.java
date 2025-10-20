class Dollar extends Money {

   Dollar(int amount) {
      this.amount = amount;
   }

   Money times(int multiplier) { // Tipo de retorno alterado de Dollar para Money
      return new Dollar(amount * multiplier);
   }
}