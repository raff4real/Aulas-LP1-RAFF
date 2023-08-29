package semana21;

//Interface = contrato
//Conjunto de métodos (somente assinatura, sem corpo)
//Classe concreta que implementa a interface

public static void main(String[] args) {


        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(15, 10);

        Circulo c1 = new Circulo(12.0);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);

        System.out.println(tela.totalPerimetro());
        System.out.println(tela.totalArea());

    }
}