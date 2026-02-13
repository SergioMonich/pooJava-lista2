/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 11/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 9 - Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque. 
//=================================================================================================================================


public class Saque extends Banco {

    // declarando atributo
    private int novoSaque;

    // construtor
    public Saque(int novoSaque) {
        
        this.novoSaque = novoSaque;

    }

    @Override
    public void realizarTransacao() {
        
        System.out.println("Saque realizado com sucesso!");
        
    }

}
