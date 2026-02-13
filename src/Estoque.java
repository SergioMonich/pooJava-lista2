/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/

//=================================================================================================================================
// EX 30 - Crie uma classe Estoque com um método atualizarQuantidade(), e implemente Eletronicos e Roupas.
//=================================================================================================================================


public abstract class Estoque {

    protected String produto;
    protected int quantidadeEstoque;
    protected int quantiddeRecebido;
    protected int quantidadeVendido;

    public Estoque(String produto, int quantidadeEstoque, int quantiddeRecebido, int quantidadeVendido) {

        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantiddeRecebido = quantiddeRecebido;
        this.quantidadeVendido = quantidadeVendido;

    }

    public abstract void atualizarQuantidade();

}
