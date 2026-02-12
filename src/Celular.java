//=================================================================================================================================
// EX 16 - Crie uma classe AparelhoEletronico com um método ligar(), e implemente Celular e Tablet. 
//=================================================================================================================================


public class Celular extends AparelhoEletronico {

    // sobrescrita de método
    @Override
    public void ligar() {
        
        System.out.println("Celular está ligando...");
        
    }

}
