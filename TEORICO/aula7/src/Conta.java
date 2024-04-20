public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    Cliente cliente;

    public Conta(){
        this.cliente.nome =
    }

    public void sacar(float quantia) {
        this.saldo -= quantia;
    }

    public void depositar(float quantia) {
        this.saldo += quantia;
    }
}
