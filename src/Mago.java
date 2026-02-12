//=================================================================================================================================
// EX 10 - Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago.
//=================================================================================================================================


public class Mago extends Personagem {

    public Mago(String nome, int forca) {
        
        super(nome, forca);
    }

    @Override
    public void atacar() {
        
        System.out.println("O mago " + nome + " atacou com " + forca + " de força...");
        
    }

}
