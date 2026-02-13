/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 25 - Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico. 
//=================================================================================================================================


public abstract class Livro {

    protected String titulo;
    protected String editora;
    protected int anoPublicacao;

    public Livro(String titulo, String editora, int anoPublicacao) {

        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;

    }

    public abstract void abrir();

}
