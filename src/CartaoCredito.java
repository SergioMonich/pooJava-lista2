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


public class CartaoCredito extends Pagamento {

    private String bandeira;

    public CartaoCredito(String bandeira) {

        this.bandeira = bandeira;

    }

    @Override
    public void realizarPagamento() {
        
        System.out.println("Pagamento realizado com CARTÃO DE CRÉDITO bandeira " + bandeira);
        
    }

}
