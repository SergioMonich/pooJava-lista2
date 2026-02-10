//=================================================================================================================================
// EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
//=================================================================================================================================


public class Carro extends Veiculo{

    //construtor com herança
    public Carro(String marca, String modelo) {
        
        super(marca, modelo);
        
    }

    //sobrescrição do método abstrato
    @Override
    public void mover() {
        
        System.out.println(modelo + " está se movendo...");
    }

}