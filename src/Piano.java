//=================================================================================================================================
/// EX 2 - Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano. 
//=================================================================================================================================


public class Piano extends InstrumentoMusical {

    public Piano(String marca, String modelo) {
        
        super(marca, modelo);

    }

    @Override
    public void tocar() {
        
        System.out.println(marca + " " + modelo + " esta fazendo uma melodia...");
        
    }

}
