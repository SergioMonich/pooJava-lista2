/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 22 - Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente ContaCorrente e ContaPoupanca.  
//=================================================================================================================================


public abstract class ContaBancaria {

    protected String tipoConta;
    protected String nomeCliente;
    protected int numeroConta;
    protected double saldo;
    protected double valor;

    

    public ContaBancaria(String tipoConta, String nomeCliente, int numeroConta, double saldo, double valor) {

        this.tipoConta = tipoConta;
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.valor = valor;

    }

    public abstract void sacar();

    public abstract void depositar();

}
