//=================================================================================================================================
// EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
//=================================================================================================================================


abstract class Veiculo {

    //declarando os atributos
    private String marca;
    protected String modelo;
    
    //construtor
    public Veiculo(String marca, String modelo) {
        
        this.marca = marca;
        this.modelo = modelo;
    
    }

    //declarando método abstrato
    public abstract void mover();

}
