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
        
        System.out.println("Área do retangulo: " + (base * largura));

    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("Perímetro do retangulo: " + (2 * (largura + base)));
    }

}
