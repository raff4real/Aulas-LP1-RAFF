package semana21;

import java.util.ArrayList;

public class Tela {
    //private ArrayList <Quadrado> quadrados;
   // private ArrayList <Retangulo> retangulos;
   private ArrayList <FiguraGeometrica> figuras;

    public Tela(){
        //quadrados = new ArrayList<Quadrado>();
        //retangulos = new ArrayList<Retangulo>();
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica f){
        figuras.add(f);
    }

//     public void addQuadrado(Quadrado q){
//         quadrados.add(q);
//     }

//    public void addRetangulo(Retangulo r){
//       retangulos.add(r);
//     }

    public double totalArea() {
        double total = 0;
        for(FiguraGeometrica figura : figuras) {
            total+= figura.calcularPerimetro();
        }
    //     for(Quadrado quadrado: quadrados){
    //         total+= quadrado.calcularArea();
    //     }

    //     for(Retangulo retangulo : retangulos){
    //         total+= retangulo.calcularArea();
    //     }
       return total;
     }

    
public class Tela {
    private ArrayList<FiguraGeometrica> figuras;




    public Tela(){
        figuras = new ArrayList<>();


    }

    public void addFigura(FiguraGeometrica figura){
        figuras.add(figura);
    }

    public double totalArea(){
        double total = 0.0;

        for(FiguraGeometrica figuraGeometrica : figuras){
            total += figuraGeometrica.calcularArea();
        }

        return total;
    }

    public double totalPerimetro(){
        double total = 0.0;

        for(FiguraGeometrica figuraGeometrica : figuras){
            total += figuraGeometrica.calcularPerimetro();
        }

        return total;
    }
}
        //     total+= retangulo.calcularPerimetro();
        // }
       return total;
    }
    
}