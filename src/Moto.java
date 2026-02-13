/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 12/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 14 - Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente Moto e Caminhão.
//=================================================================================================================================


public class Moto extends Transporte {

    @Override
    public void velocidadeMaxima() {
        
        System.out.println("Moto está em movimento...");
        
    }

    

}
