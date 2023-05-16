package semana12;

public class Quadrado {
    public double lado;
    //construtor terá o mesmo nome da classe e não retornará nada (não sera declarado)

    //"double l" é o parametro = que retorna valor
    public Quadrado(double lado){
        this.lado = lado; 
    }  

    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){

    return 4*lado;
}

}
