/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 3 - Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e calcularPerimetro(). Crie Circulo e Retangulo. 
//=================================================================================================================================


public class Retangulo extends FormaGeometrica {

    //declarando os atributos específicos da classe
    private float largura;
    private float base;

    //construtor
    public Retangulo(float largura, float base) {
        
        this.largura = largura;
        this.base = base;

    }

    //sbrescrevendo os métodos abstratos
    @Override
    public void calcularArea() {
        
        System.out.printf("Área do retangulo: %.2f%n", (base * largura));

    }

    @Override
    public void calcularPerimetro() {
        
        System.out.printf("Perímetro do retangulo: %.2f%n", (2 * (largura + base)));
    }

}
