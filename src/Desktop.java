/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 20 - Crie uma classe Computador com um método processar(), e implemente Desktop e Notebook. 
//=================================================================================================================================


public class Desktop extends Computador {

    public Desktop(String modelo) {

        super(modelo);

    }

    @Override
    public void processar() {
        
        System.out.println(modelo + " esta procesando....");
        
    }   

}
