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


public abstract class RedeSocial {

    protected String nome;

    public RedeSocial(String nome) {

        this.nome = nome;

    }

    public abstract void postar();

    public abstract void curtir();

}
