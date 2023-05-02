package semana10;

class Retangulo{
    // atributos necessarios para resolver a questão 
    public double base;
    public double altura;
    
    //metodos (não passamos os valores nos metodos pois ja temos eles "declarados" aqui na classe)
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2* (base * altura);

    }
}
