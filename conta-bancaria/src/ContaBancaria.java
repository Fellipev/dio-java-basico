public class ContaBancaria {

    private double saldo;
    private double valorSolicitado;

    public ContaBancaria(double saldo, double valorSolicitado) throws SaldoInsuficienteException {

        this.valorSolicitado = valorSolicitado;
        
        if (saldo >= valorSolicitado) {
            this.saldo = saldo - valorSolicitado;
        } else {
            throw new SaldoInsuficienteException(saldo, this.valorSolicitado);
        }
    }

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) throws SaldoInsuficienteException {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            throw new SaldoInsuficienteException(this.saldo, this.valorSolicitado);
        }
    }

    @Override
    public String toString() {

        String info = "Saldo atual: " + this.saldo;
        info += "\nValor solicitado: " + this.valorSolicitado;
        return info;
    }

}
