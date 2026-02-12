//=================================================================================================================================
// EX 15 - Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word. 
//=================================================================================================================================


public class Word extends Documento {

    @Override
    public void imprimir() {
        
        System.out.println("WORD está imprimindo");
        
    }

}
