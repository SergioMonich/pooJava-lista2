//=================================================================================================================================
// EX 4 - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario. 
//=================================================================================================================================

//=================================================================================================================================
// EX 7 - Adicione um método concreto descansar() à classe Funcionario, que imprime Descansando.... 
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

}
