/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


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
