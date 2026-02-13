//=================================================================================================================================
// EX 17 - Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos (Pizza, Sushi).
//=================================================================================================================================


public abstract class Prato {

    // declarando atributos
    protected String nome;
    protected String tamanho;
    
    // construtor
    public Prato(String nome, String tamanho) {
        
        this.nome = nome;
        this.tamanho = tamanho;

    }

    // método abstrto
    public abstract void pratoPronto();

}
