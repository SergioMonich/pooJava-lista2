//=================================================================================================================================
// EX 11 - Crie uma classe Jogador que extenda Personagem e adicione um método usarHabilidadeEspecial(). 
//=================================================================================================================================


public class Jogador extends Personagem {

    public Jogador(String nome, int forca) {
        
        super(nome, forca);

    }

    public void usarHabilidadeEspecial() {

        System.out.println("Jogador " + nome + " usou habilidade especial");
        
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }

}
