//=================================================================================================================================
// EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
//=================================================================================================================================

//=================================================================================================================================
// EX 8 - Adicione um atributo cor à classe Veiculo e um método concreto mostrarCor(). 
//=================================================================================================================================


abstract class Veiculo {

    // declarando os atributos
    protected String marca;
    protected String modelo;
    protected String cor;
    
    // construtor  
    public Veiculo(String marca, String modelo, String cor) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;

    }

    // declarando método abstrato
    public abstract void mover();

    // método concreto
    public void mostrarCor() {

        System.out.println("Veículo " + marca + " " + modelo + " é da cor " + cor);

    }

}
