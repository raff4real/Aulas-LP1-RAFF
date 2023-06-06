package semana14;

public class Retangulo {
    
    //atributos
    public double altura;
    public double base;

    
    public double getAltura (){
        return altura;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }
    
    public double getBase (){
        return altura;
    }
    public void setBase (double base){
        this.base = base;
    }
    
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
