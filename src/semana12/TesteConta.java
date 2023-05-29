package semana12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteConta {

    @Test
    public void testSaque() {
        Conta conta = new Conta(1, "Rafa");
        conta.depositar(100.0);
        conta.sacar(50.0);
        assertEquals(50.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSaqueValorInvalido() {
        Conta conta = new Conta(1, "Rafa");
        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(-50.0);
        });
    }

    @Test
    public void testSaqueSaldoInsuficiente() {
        Conta conta = new Conta(1, "Rafa");
        conta.depositar(100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(150.0);
        });
    }

    @Test
    public void testDeposito() {
        Conta conta = new Conta(1, "Rafa");
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    public void testDepositoValorInvalido() {
        Conta conta = new Conta(1, "Rafa");
        assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(-50.0);
        });
    }

    @Test
    public void testTransferencia() {
        Conta conta1 = new Conta(1, "Rafa");
        Conta conta2 = new Conta(2, "Joana");
        conta1.depositar(100.0);
        conta1.transferir(50.0, conta2);
        assertEquals(50.0, conta1.getSaldo(), 0.001);
       