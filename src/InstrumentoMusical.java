//=================================================================================================================================
/// EX 2 - Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano. 
//=================================================================================================================================


abstract class InstrumentoMusical {

    //declarando atributos
    protected String marca;
    protected String modelo;

    public InstrumentoMusical(String marca, String modelo) {
        
        this.marca = marca;
        this.modelo = modelo;
    }

    //declarando método abstrato
    public abstract void tocar();

}
