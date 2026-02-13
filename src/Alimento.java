/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 27 - Crie uma classe Produto com um método calcularDesconto(), e implemente Eletronico e Alimento.
//=================================================================================================================================


public class Alimento extends Produto {

    public Alimento(String produto, double valor) {

        super(produto, valor);

    }

    @Override
    public void calcularDesconto() {
        
        double desc  = 0.05;
        double valorDesc = valor - (valor * desc);
        System.out.println(produto + " com desconto!!!");
        System.out.printf("Valor Normal: R$%.2f%n", valor);
        System.out.printf("Valor PROMOCIONAL: R$%.2f%n", valorDesc);
        
    }  

}
