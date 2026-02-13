/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 26 - Crie uma classe Trabalho com um método executar(), e implemente Professor e Engenheiro.  
//=================================================================================================================================


public abstract class Trabalho {

    protected String nome;
    protected String cargo;

    public Trabalho(String nome, String cargo) {

        this.nome = nome;
        this.cargo = cargo;

    }

    public abstract void executar();

}
