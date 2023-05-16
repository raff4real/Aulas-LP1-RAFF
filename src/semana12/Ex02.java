package semana12;

public class Ex02 {
    
public double calcularImc(){
    return peso/(altura*altura);
}


        public double altura;
        public double peso;
    
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
            p1.altura = 172;
            p1.peso = 70.3;
    
            double imc = p1.calcularImc();
            String faixa = p1.getFaixa();
            String situacao = p1.getSituacao();
    
            System.out.println("IMC: " + imc);
            System.out.println("Faixa: " + faixa);
            System.out.println("Situação: " + situacao);
        }
    }
}
