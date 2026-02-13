/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 18 - Crie uma classe Jogo com um método iniciar(), e implemente JogoAventura e JogoCorrida. 
//=================================================================================================================================


public abstract class Jogo {

    // declarando atributos
    protected String nomeJogo;
    
    // construtor
    public Jogo(String nomeJogo) {
        
        this.nomeJogo = nomeJogo;

    }

    // método abstrato
    public abstract void iniciar();

}
