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


public class Esfera extends Forma3D {

    private int raio;

    public Esfera(int raio) {
    
        this.raio = raio;
    }

    @Override
    public void calcularVolume() {

        double volume = Math.pow(raio, 3) * (4.0 / 3.0) * Math.PI;       
        System.out.printf("Volume da esfera: %.2f%n", volume);
        
    } 

}
