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


public abstract class Produto {

    protected String produto;
    protected double valor;

    public Produto(String produto, double valor) {

        this.produto = produto;
        this.valor = valor;

    }

    public abstract void calcularDesconto();

}
