//=================================================================================================================================
// EX 9 - Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque. 
//=================================================================================================================================


public class Deposito extends Banco {

    // declarando atributo
    private int novoDeposito;

    // construtor
    public Deposito(int novoDeposito) {
        
        this.novoDeposito = novoDeposito;

    }

    @Override
    public void realizarTransacao() {
        
        System.out.println("Deposito realziado com sucesso!");

    }

}
