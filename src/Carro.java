/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
//=================================================================================================================================


public class Carro extends Veiculo{

    //construtor com herança
    public Carro(String marca, String modelo, String cor) {
        
        super(marca, modelo, cor);
        
    }

    //sobrescrição do método abstrato
    @Override
    public void mover() {
        
        System.out.println(modelo + " está se movendo...");
    }

}