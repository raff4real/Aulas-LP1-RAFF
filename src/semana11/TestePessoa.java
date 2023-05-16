package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestePessoa {
    @Test
    public void testaCalcularIMC() {
        PessoaPeso p1 = new PessoaPeso();
        p1.altura = 1.72;
        p1.peso = 70.3;

        double imc = p1.calcularImc();

         assertEquals (23.762, imc, 0.001);
    }

    @Test
    public void testaGetFaixa() {
        PessoaPeso p1 = new PessoaPeso();
        p1.altura = 172;
        p1.peso = 70.3;

        String faixa = p1.getFaixa();
    }

    @Test
    public void testaGetSituacao() {
        PessoaPeso p1 = new PessoaPeso();
        p1.altura = 172;
        p1.peso = 70.3;

        String situacao = p1.getSituacao();
    }
}