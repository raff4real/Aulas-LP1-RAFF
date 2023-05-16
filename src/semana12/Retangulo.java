package semana12;

public class Retangulo {
    
    //atributos
    public double altura;
    public double base;

    //criando construtores
   
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura= altura;
    
        
    }
    //metodos
   
    public Retangulo (double valor){
        base = valor;
        altura = valor; 

    }
   
    public double calcularArea() {
        return base * altura;
              
    }
   
    public double calcularPerimetro(){
        return 2*(base + altura);
    
    }
}
