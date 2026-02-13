//=================================================================================================================================
// EX 17 - Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos (Pizza, Sushi).
//=================================================================================================================================


public class Pizza extends Prato {

    // construtor com heraança da classe Prato
    public Pizza(String nome, String tamanho) {
        
        super(nome, tamanho);

    }

    // sobrescrita de método
    @Override
    public void pratoPronto() {
        
        System.out.println("A PIZZA " + nome + " está pronta!");
        
    }

}
