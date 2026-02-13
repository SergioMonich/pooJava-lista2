/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 11/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 4 - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario. 
//=================================================================================================================================

//=================================================================================================================================
// EX 12 - Adicione um método calcularBonificacao() à classe Funcionario, e sobrescreva em Gerente. 
//=================================================================================================================================


public class Gerente extends Funcionario {

    // construtor herdado
    public Gerente(String nome) {
        
        super(nome);
    }

    // sobrescrição do método abstarto
    @Override
    public void calcularSalario() {
        
        System.out.println("Salario do GERENTE " + nome);
    }

    @Override
    public void calcularBonificacao() {
        
        System.out.println(nome + " ganhou bonificação de $200");

    }

    

}
