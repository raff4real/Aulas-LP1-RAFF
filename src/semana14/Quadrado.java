package semana14;

public class Quadrado {
    private double lado;
    //construtor terá o mesmo nome da classe e não retornará nada (não sera declarado)

    //"double lado" é o parametro = que retorna valor
    public Quadrado(double lado){
        this.lado = lado; 
    }  

    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){

    return 4*lado;
}

// getter - get (serve para devolver(ler) o valor de um atributo privado, quando nao queremos queremos q valor seja modificado após a criação)

    public double getLado () {
    return lado;
}

// setter - set (serve para modificar uma info do atributo, como (se pode ser negativo ou nao e etc) )

    public void setLado (double Lado){
        if (lado<0.0){
         throw new RuntimeException("lado inválido");
             }
        this.lado = lado;

        }

    }


    