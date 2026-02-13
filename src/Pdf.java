/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 12/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 15 - Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word. 
//=================================================================================================================================


public class Pdf extends Documento {

    // sobrescrita de método
    @Override
    public void imprimir() {
        
        System.out.println("PDF está imprimindo");
        
    }

}
