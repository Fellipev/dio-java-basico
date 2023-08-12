public class SaldoInsuficienteException extends Exception{
    
    private double saldo;
    private double valorSolicitado;

    public SaldoInsuficienteException(double saldo, double valorSolicitado) {

        this.saldo = saldo;
        this.valorSolicitado = valorSolicitado;
    }

    @Override
    public String getMessage() {
        return "Saldo insuficiente!\nSaldo: " + this.saldo + "\nValor solicitado: " + this.valorSolicitado;
    }
}
