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


public class Professor extends Trabalho {

    public Professor(String nome, String cargo) {

        super(nome, cargo);
        
    }

    @Override
    public void executar() {
        
        System.out.println(nome + " é " + cargo);
        
    }

}
