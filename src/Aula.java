/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 29 - Crie uma classe Aula com um método ministrar(), e implemente Matematica e Portugues.  
//=================================================================================================================================


public abstract class Aula {

    protected String professor;
    protected String materia;
    
    public Aula(String professor, String materia) {

        this.professor = professor;
        this.materia = materia;

    }

    public abstract void ministrar();
    
}
