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


public class Circulo extends FormaGeometrica {

    //declarando atributos específicos do objeto
    private float pi = (float) 3.14;
    private float raio;

    //construtor
    public Circulo(float raio) {
        
        this.raio = raio;

    }

    //sobrescrição dos métodos abstratos
    @Override
    public void calcularArea() {
        
        System.out.printf("Área do circulo: %.2f%n", ((Math.pow(raio, 2) * pi))); //método da biblioteca de matemática
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.printf("Perímetro do círculo: %.2f%n", (2 * pi * raio));

    }

}
