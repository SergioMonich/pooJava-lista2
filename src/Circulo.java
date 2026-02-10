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
        
        System.out.println("Área do circulo: " + ((Math.pow(raio, 2) * pi))); //método da biblioteca de matemática
        
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("Perímetro do círculo: " + (2 * pi * raio));

    }

}
