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
// EX 7 - Adicione um método concreto descansar() à classe Funcionario, que imprime Descansando.... 
//=================================================================================================================================

//=================================================================================================================================
// EX 12 - Adicione um método calcularBonificacao() à classe Funcionario, e sobrescreva em Gerente. 
//=================================================================================================================================

//=================================================================================================================================
// EX 28 - Crie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e Designer. 
//=================================================================================================================================


abstract class Funcionario {

    // declaranda o atributo
    protected String nome;

    // construtor
    public Funcionario(String nome) {
        
        this.nome = nome;

    }

    // método abstrato
    public abstract void calcularSalario();

    // método concreto
    public void descansar() {

        System.out.println("Funcionario " + nome + " esta descansando...");

    }

    public void calcularBonificacao() {

        System.out.println(nome + " ganhou bonificação de $100");
        
    }

    public abstract void baterPonto();

}
