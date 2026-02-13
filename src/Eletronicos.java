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


public class Eletronicos extends Estoque {

    public Eletronicos(String produto, int quantidadeEstoque, int quantiddeRecebido, int quantidadeVendido) {

        super(produto, quantidadeEstoque, quantiddeRecebido, quantidadeVendido);

    }

    @Override
    public void atualizarQuantidade() {
        
        quantidadeEstoque += quantiddeRecebido;
        quantidadeEstoque -= quantidadeVendido;
        System.out.println("Produto: " + produto);
        System.out.println("Estoque atualizado: " + quantidadeEstoque);
        
    }

    

    

}
