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


public class Matematica extends Aula {

    public Matematica(String professor, String materia) {

        super(professor, materia);

    }

    @Override
    public void ministrar() {
        
        System.out.println(professor + " vai dar aula de " + materia);
        
    }

        

}
