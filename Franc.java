class Franc extends Money {

    Franc(int amount) {
       this.amount = amount;
    }

    Money times(int multiplier) { // Tipo de retorno alterado de Franc para Money
       return new Franc(amount * multiplier);
    }
}