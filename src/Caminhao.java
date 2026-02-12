//=================================================================================================================================
// EX 14 - Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente Moto e Caminhão.
//=================================================================================================================================


public class Caminhao extends Transporte {

    @Override
    public void velocidadeMaxima() {
        
        System.out.println("Caminhão está em movimento...");
        
    }

}
