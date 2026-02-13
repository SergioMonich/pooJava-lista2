/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 12/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 10 - Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago.
//=================================================================================================================================


public class Guereriro extends Personagem {

    // construtor com herança
     public Guereriro(String nome, int forca) {
        
        super(nome, forca);

    }

    // sobrescrita do método abstrato
    @Override
    public void atacar() {
        
        System.out.println("O guerreiro " + nome + " atacou com " + forca + " de força...");
        
    }

}
