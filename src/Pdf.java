//=================================================================================================================================
// EX 15 - Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word. 
//=================================================================================================================================


public class Pdf extends Documento {

    // sobrescrita de método
    @Override
    public void imprimir() {
        
        System.out.println("PDF está imprimindo");
        
    }

}
