/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 24 - Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito e BoletoBancario. 
//=================================================================================================================================


public class BoletoBancario extends Pagamento {

    

    public BoletoBancario() {
        
    }

    @Override
    public void realizarPagamento() {
        
        System.out.println("Pagamento realizado com BOLETO BANCÁRIO");
        
    }

}
