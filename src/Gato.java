/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 11/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 5 - Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.  
//=================================================================================================================================


public class Gato extends Animal {

    public Gato(String raca, String nome, String cor, int idade) {
        
        super(raca, nome, cor, idade);

    }

    @Override
    public void fazerSom() {
        
        System.out.println("Gato " + raca + " " + nome + " " + cor + " fez miauuuu...");
        
    } 

}
