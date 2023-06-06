package semana14;

public class Conta {
    private final int codigo;
    private double saldo;
    private final String correntista;

    public Conta(int codigo, String correntista) {
        if (codigo <= 0) {
            throw new RuntimeException("Código inválido para conta");
        }

        if (correntista.length() < 5 || correntista.length() > 100) {
            throw new RuntimeException("Nome do correntista deve ter entre 5 e 100 caracteres");
        }

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
            throw new RuntimeException("Valor inválido para saque");
        }

        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("Valor inválido para depósito");
        }

        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new RuntimeException("Valor inválido para transferência");
        }

        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente para transferência");
        }

        saldo -= valor;
        contaDestino.depositar(valor);
    }
}
