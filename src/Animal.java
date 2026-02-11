//=================================================================================================================================
// EX 5 - Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.  
//=================================================================================================================================

//=================================================================================================================================
// EX 6 - Adicione um construtor à classe Animal que aceite um nome e um método getNome().
//=================================================================================================================================

abstract class Animal {

    // declarando os atributos
    protected String raca;
    protected String nome;
    protected String cor;
    protected int idade;
    
    // construtor genérico
    public Animal(String raca, String nome, String cor, int idade) {
        
        this.raca = raca;
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;

    }

    // método abstrato
    public abstract void fazerSom();

    // getters
    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

}
