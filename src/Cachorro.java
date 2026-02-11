//=================================================================================================================================
// EX 5 - Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.  
//=================================================================================================================================


public class Cachorro extends Animal {

    // construtor com herança
    public Cachorro(String raca, String nome, String cor, int idade) {
        
        super(raca, nome, cor, idade);

    }

    // sobrescrita de método abstrato
    @Override
    public void fazerSom() {
        
        System.out.println("Cachorro " + raca + " " + nome + " " + cor + " fez auauau...");
        
    }

}
