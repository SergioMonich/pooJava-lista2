//=================================================================================================================================
// EX 4 - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario. 
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

}
