//=================================================================================================================================
// EX 4 - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario. 
//=================================================================================================================================


public class Estagiario extends Funcionario {

    public Estagiario(String nome) {
        super(nome);
    }

    @Override
    public void calcularSalario() {
        
        System.out.println("Salario do ESTAGIARIO " + nome);
        
    }

}
