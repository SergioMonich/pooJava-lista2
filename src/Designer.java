/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 28 - Crie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e Designer. 
//=================================================================================================================================


public class Designer extends Funcionario {

    private String cargo;

    public Designer(String nome, String cargo) {

        super(nome);
        this.cargo = cargo;

    }

    @Override
    public void baterPonto() {
        
        System.out.println(cargo + " " + nome + " bateu ponto.");
        
    }

    @Override
    public void calcularBonificacao() {
        // TODO Auto-generated method stub
        super.calcularBonificacao();
    }

    @Override
    public void calcularSalario() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void descansar() {
        // TODO Auto-generated method stub
        super.descansar();
    }

}
