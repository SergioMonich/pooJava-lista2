//=================================================================================================================================
// EX 17 - Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos (Pizza, Sushi).
//=================================================================================================================================


public class Sushi extends Prato {

    public Sushi(String nome, String tamanho) {
        
        super(nome, tamanho);

    }

    @Override
    public void pratoPronto() {
        
        System.out.println("O SUSHI (" + nome + ") está pronto!");
        
    }

}
