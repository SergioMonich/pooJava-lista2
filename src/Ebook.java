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


public class Ebook extends Livro {

    public Ebook(String titulo, String editora, int anoPublicacao) {

        super(titulo, editora, anoPublicacao);

    }

    @Override
    public void abrir() {
        
        System.out.println("Abrindo " + titulo + " no EBOOK");
        
    }

}
