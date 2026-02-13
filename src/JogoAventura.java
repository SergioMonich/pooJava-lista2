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


public class JogoAventura extends Jogo {

    // construtor com herança
    public JogoAventura(String nomeJogo) {
        
        super(nomeJogo);

    }

    // sobrescrita de método
    @Override
    public void iniciar() {
        
        System.out.println(nomeJogo + " esta iniciando...");
        
    }

}
