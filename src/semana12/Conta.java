public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
        
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }

        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }

        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para transferência");
        }
        
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }

        saldo -= valor;
        contaDestino.depositar(valor);
    }
}
