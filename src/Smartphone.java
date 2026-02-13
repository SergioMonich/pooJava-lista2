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


public class Smartphone extends Dispositivo {

    public Smartphone(String nomeModelo) {

        super(nomeModelo);

    }

    @Override
    public void conectarInternet() {
        
        System.out.println(nomeModelo + " se conectou na internet.");
        
    }

}
