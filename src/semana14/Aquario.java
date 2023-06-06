package semana14;

//ex01
public class Aquario {

    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura) {
        setComprimento(comprimento);
        setAltura(altura);
        setLargura(largura);
    }

    public Aquario(double valor) {
        this(valor, valor, valor);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("O comprimento deve ser maior que zero.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura deve ser maior que zero.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("A largura deve ser maior que zero.");
        }
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }

    public double calcularPotenciaTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
        return filtragem;
    }
}
