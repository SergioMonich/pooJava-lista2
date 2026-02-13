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


public class ContaPoupanca  extends ContaBancaria {

    public ContaPoupanca(String tipoConta, String nomeCliente, int numeroConta, double saldo, double valor) {

        super(tipoConta, nomeCliente, numeroConta, saldo, valor);

    }

    @Override
    public void depositar() {
        
        saldo+= valor;
        System.out.println(nomeCliente + ", seu DEPOSITO EM CONTA POIUPANÇA de R$" + valor + " foi realizado com sucesso! Saldo atual R$" + saldo);
        
    }

    @Override
    public void sacar() {
        
        saldo-= valor;
        System.out.println(nomeCliente + ", seu SAQUE EM CONTA POUPANÇA de R$" + valor + " foi realizado com sucesso! Saldo atual R$" + saldo);
        
    }

}
