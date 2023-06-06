package semana14;

//Ex02
public class Pessoa {
    private double altura;
    private double peso;

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("O peso deve ser maior que zero.");
        }
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String getFaixa() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String getSituacao() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "GANHAR"; // ganhar peso
        } else if (imc < 25) {
            return "NORMAL"; // peso ok
        } else {
            return "PERDER"; // perder peso
        }
    }

    public static void main(String[] args) {
        PessoaPeso p1 = new PessoaPeso();
        p1.setAltura(172);
        p1.setPeso(70.3);

        double imc = p1.calcularImc();
        String faixa = p1.getFaixa();
        String situacao = p1.getSituacao();

        System.out.println("IMC: " + imc);
        System.out.println("Faixa: " + faixa);
        System.out.println("Situação: " + situacao);
    }
}
