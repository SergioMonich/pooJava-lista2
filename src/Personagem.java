/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 12/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 10 - Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago.
//=================================================================================================================================


public abstract class Personagem {

    // declraando os atributos
    protected String nome;
    protected int forca; 
 
    // cosntrutor
    public Personagem(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    // método abstrato
    public abstract void atacar();

}
