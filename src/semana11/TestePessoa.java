
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestePessoa {
    @Test
    public void testCalcularImc() {
        TestePessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        double imc = p1.calcularImc();
        double imcEsperado = 23.716037857380535;

        assertEquals(imcEsperado, imc, 0.0001);
    }

    @Test
    public void testGetFaixa() {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        String faixa = p1.getFaixa();
        String faixaEsperada = "Peso normal";

        assertEquals(faixaEsperada, faixa);
    }

    @Test
    public void testGetSituacao() {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        String situacao = p1.getSituacao();
        String situacaoEsperada = "NORMAL";

        assertEquals(situacaoEsperada, situacao);
    }
}
