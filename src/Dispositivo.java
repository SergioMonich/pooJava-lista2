/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 13/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


//=================================================================================================================================
// EX 23 - Crie uma classe Dispositivo com um método conectarInternet(), e implemente Smartphone e SmartTV. 
//=================================================================================================================================


public abstract class Dispositivo {

    protected String nomeModelo;

    public Dispositivo(String nomeModelo) {

        this.nomeModelo = nomeModelo;

    }

    public abstract void conectarInternet();

}
