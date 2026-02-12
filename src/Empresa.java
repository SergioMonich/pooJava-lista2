//=================================================================================================================================
// EX 13 - Adicione uma lista de funcionários a Empresa e um método listarFuncionarios(). 
//=================================================================================================================================

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // lista de funcionários
    List<String> nomes = new ArrayList<>();

    // cnstrutor para adicionar os nomes
    public Empresa() {

        nomes.add("Marcos");
        nomes.add("Maria");
        nomes.add("Antonio");

    }
    
    // método mostrar lista
    public void listarFuncionarios() {

        System.out.println(nomes);

        /**
         * essa seria outra maneira de imprimir a lista utilizando o loop FOR-EACH
        for (String nome : nomes) {

            System.out.println(nome);

        }
        */
        
    }

}
