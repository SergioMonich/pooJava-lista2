/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 19 - Crie uma classe Forma3D que tenha calcularVolume(), e implemente Esfera e Cubo. 
//=================================================================================================================================


public class Cubo extends Forma3D {

    private int lado;

    public Cubo(int lado) {

        this.lado = lado;

    }

    @Override
    public void calcularVolume() {

        double volume = Math.pow(lado, 3);
        System.out.printf("Volume do cubo: %.2f%n", volume); //forma de apresentar com 2 casas decimais
        
    }

}
