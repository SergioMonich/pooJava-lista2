//=================================================================================================================================
// EX 9 - Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque. 
//=================================================================================================================================


public class Saque extends Banco {

    // declarando atributo
    private int novoSaque;

    // construtor
    public Saque(int novoSaque) {
        
        this.novoSaque = novoSaque;

    }

    @Override
    public void realizarTransacao() {
        
        System.out.println("Saque realizado com sucesso!");
        
    }

}
