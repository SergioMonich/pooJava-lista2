//=================================================================================================================================
/// EX 2 - Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano. 
//=================================================================================================================================


public class Guitarra extends InstrumentoMusical {

    public Guitarra(String marca, String modelo) {
        
        super(marca, modelo);

    }

    @Override
    public void tocar() {
        
        System.out.println(marca + " " + modelo + " esta fazendo um solo...");
    }

}
