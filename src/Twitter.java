/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 21 - Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter. 
//=================================================================================================================================


public class Twitter extends RedeSocial {

    public Twitter(String nome) {

        super(nome);

    }

    @Override
    public void curtir() {
        
        System.out.println(nome + ", você curtiu um post no TWITTER");
        
    }

    @Override
    public void postar() {
        
        System.out.println(nome + ", você postou no TWITTER");
        
    }

}
