//=================================================================================================================================
// EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
//=================================================================================================================================


public class Bicicleta extends Veiculo {

    public Bicicleta(String marca, String modelo) {
        
        super(marca, modelo);
        
    }

    @Override
    public void mover() {
        
        System.out.println(modelo + " está se movendo...");
    }

}
