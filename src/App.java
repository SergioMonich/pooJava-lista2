/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 10/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/


/**
 * @brief Instruções de execução
 * 
 * Para executar um exercício individual:
 * 1. Comente todos os blocos de exercícios na main
 * 2. Deixe descomentado apenas o exercício desejado
 * 3. Execute a aplicação normalmente
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        //=================================================================================================================================
        // EX 1 - Crie uma classe abstrata Veiculo com um método abstrato mover(), e implemente Carro e Bicicleta. 
        //=================================================================================================================================
        /*
        Carro car1 = new Carro("Renault", "Sandero", "branco");
        Bicicleta bike1 = new Bicicleta("Caloi", "e-vibe", "azul");

        car1.mover();
        car1.mostrarCor();
        bike1.mover();
        bike1.mostrarCor();
        */
        //=================================================================================================================================
        // EX 2 - Crie uma classe abstrata InstrumentoMusical com um método abstrato tocar(), e implemente Guitarra e Piano. 
        //=================================================================================================================================
        /*
        Guitarra guitar1 = new Guitarra("Fender", "Player plus Stratocaster");

        Piano piano1 = new Piano("Roland", "FP-30X-BK");

        guitar1.tocar();
        piano1.tocar();
        */
        //=================================================================================================================================
        // EX 3 - Crie uma classe abstrata FormaGeometrica com métodos abstratos calcularArea() e calcularPerimetro(). Crie Circulo e Retangulo. 
        //=================================================================================================================================
        /*
        Circulo circulo1 = new Circulo(30);
        Retangulo ret1 = new Retangulo(20, 10);

        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        ret1.calcularArea();
        ret1.calcularPerimetro();
        */
        //=================================================================================================================================
        // EX 4 - Crie uma classe abstrata Funcionario com um método abstrato calcularSalario(). Crie Gerente e Estagiario. 
        //=================================================================================================================================
        /*
        Gerente gere1 = new Gerente("Sergio");
        Gerente gere2 = new Gerente("Felipe");
        Estagiario estag1 = new Estagiario("Lucas");
        Estagiario estag2 = new Estagiario("Milena");

        gere1.calcularSalario();
        gere2.calcularSalario();
        estag1.calcularSalario();
        estag2.calcularSalario();

        gere1.descansar();

        estag1.calcularBonificacao();
        gere2.calcularBonificacao();
        */
        //=================================================================================================================================
        // EX 5 - Crie uma classe abstrata Animal com um método abstrato fazerSom(). Implemente Cachorro e Gato.  
        //=================================================================================================================================
        /*
        Cachorro dog1 = new Cachorro("Beagle", "Fominha", "vermelho e branco", 6);
        Gato cat1 = new Gato("Persa", "Chapado", "branco", 2);

        dog1.fazerSom();
        cat1.fazerSom();
        */
        //=================================================================================================================================
        // EX 6 - Adicione um construtor à classe Animal que aceite um nome e um método getNome().
        //=================================================================================================================================
        /*
        Veja ex 5
        */
        //=================================================================================================================================
        // EX 7 - Adicione um método concreto descansar() à classe Funcionario, que imprime Descansando.... 
        //=================================================================================================================================
        /*
        Veja ex 4
        */
        //=================================================================================================================================
        // EX 8 - Adicione um atributo cor à classe Veiculo e um método concreto mostrarCor(). 
        //=================================================================================================================================
        /*
        Veja ex 1
        */
        //=================================================================================================================================
        // EX 9 - Crie uma classe Banco com um método abstrato realizarTransacao(), e implemente Deposito e Saque. 
        //=================================================================================================================================
        /*
        Deposito dep1 = new Deposito(123456);
        Saque saq1 = new Saque(456789);
        
        dep1.realizarTransacao();
        saq1.realizarTransacao();
        */
        //=================================================================================================================================
        // EX 10 - Crie uma classe abstrata Personagem com um método atacar(), e implemente Guerreiro e Mago.
        //=================================================================================================================================
        /*
        Guereriro warrior1 = new Guereriro("Tharion", 7);
        Guereriro warrior2 = new Guereriro("Kael", 8);
        
        Mago wizard1 = new Mago("Eldric", 6);
        Mago wizard2 = new Mago("Magnus", 5);

        warrior1.atacar();
        warrior2.atacar();
        wizard1.atacar();
        wizard2.atacar();
        */
        //=================================================================================================================================
        // EX 11 - Crie uma classe Jogador que extenda Personagem e adicione um método usarHabilidadeEspecial(). 
        //=================================================================================================================================
        /*
        Jogador player1 = new Jogador("Sergio", 0);
        Jogador player2 = new Jogador("Felipe", 0);

        player1.usarHabilidadeEspecial();
        player2.usarHabilidadeEspecial();
        */
        //=================================================================================================================================
        // EX 12 - Adicione um método calcularBonificacao() à classe Funcionario, e sobrescreva em Gerente. 
        //=================================================================================================================================
        /*
        Veja ex 4
        */
        //=================================================================================================================================
        // EX 13 - Adicione uma lista de funcionários a Empresa e um método listarFuncionarios(). 
        //=================================================================================================================================
        /*
        Empresa empresa = new Empresa();
        
        empresa.listarFuncionarios();
        */
        //=================================================================================================================================
        // EX 14 - Crie uma classe Transporte que tenha um método abstrato velocidadeMaxima(), e implemente Moto e Caminhão.
        //=================================================================================================================================
        /*
        Moto moto1 = new Moto();
        Caminhao cam1 = new Caminhao();

        moto1.velocidadeMaxima();
        cam1.velocidadeMaxima();
        */
        //=================================================================================================================================
        // EX 15 - Crie uma classe Documento com um método abstrato imprimir(), e implemente PDF e Word. 
        //=================================================================================================================================
        /*
        Pdf pdf1 = new Pdf();
        Word wrd1 = new Word();

        pdf1.imprimir();
        wrd1.imprimir();
        */
        //=================================================================================================================================
        // EX 16 - Crie uma classe AparelhoEletronico com um método ligar(), e implemente Celular e Tablet. 
        //=================================================================================================================================
        /*
        Celular cel1 = new Celular();
        Tablet tab1 = new Tablet();

        cel1.ligar();
        tab1.ligar();
        */
        //=================================================================================================================================
        // EX 17 - Crie uma classe Restaurante que contenha pratos (Prato), e implemente pratos específicos (Pizza, Sushi).
        //=================================================================================================================================
        /*
        Pizza piz1 = new Pizza("Napolitana", "G");
        Pizza piz2 = new Pizza("Calabresa", "M");
        Sushi sus1 = new Sushi("Nigiri", null);
        Sushi sus2 = new Sushi("Maki", null);

        piz1.pratoPronto();
        piz2.pratoPronto();
        sus1.pratoPronto();
        sus2.pratoPronto();
        */
        //=================================================================================================================================
        // EX 18 - Crie uma classe Jogo com um método iniciar(), e implemente JogoAventura e JogoCorrida. 
        //=================================================================================================================================
        /*
        JogoAventura ja1 = new JogoAventura("Sombras de Valdrenn: O Despertar das Runas");
        JogoAventura ja2 = new JogoAventura("Crônicas de Eldoria: A Lenda do Guardião");
        JogoCorrida jc1 = new JogoCorrida("Velocidade Extrema: Horizonte Urbano");
        JogoCorrida jc2 = new JogoCorrida("Nitro selvagem: Desafio das Pistas");

        ja1.iniciar();
        ja2.iniciar();
        jc1.iniciar();
        jc2.iniciar();
        */
        //=================================================================================================================================
        // EX 19 - Crie uma classe Forma3D que tenha calcularVolume(), e implemente Esfera e Cubo. 
        //=================================================================================================================================
        /*
        Esfera esf1 = new Esfera(5);
        Cubo cub1 = new Cubo(10);

        esf1.calcularVolume();
        cub1.calcularVolume();
        */
        //=================================================================================================================================
        // EX 20 - Crie uma classe Computador com um método processar(), e implemente Desktop e Notebook. 
        //=================================================================================================================================
        /*
        Desktop desk1 = new Desktop("Dell XPS i1200-M10D");
        Notebook note1=  new Notebook("Lenovo Ideapad Slim 3I");

        desk1.processar();
        note1.processar();
        */
        //=================================================================================================================================
        // EX 21 - Crie uma classe RedeSocial com métodos postar() e curtir(), e implemente Facebook e Twitter. 
        //=================================================================================================================================
        /*
        Facebook FB1 = new Facebook("Sérgio");
        Facebook FB2 = new Facebook("Lucas");
        Twitter TT1 = new Twitter("Micheli");
        Twitter TT2 = new Twitter("Milena");

        FB1.curtir();
        FB2.postar();
        TT1.curtir();
        TT2.postar();
        */
        //=================================================================================================================================
        // EX 22 - Crie uma classe ContaBancaria com métodos sacar() e depositar(), e implemente ContaCorrente e ContaPoupanca.  
        //=================================================================================================================================
        /*
        ContaCorrente cc1 = new ContaCorrente("CC", "Sergio Monich", 1234, 10000, 500);
        ContaPoupanca cp1 = new ContaPoupanca("CP", "Micheli Monich", 987654, 20000, 250);

        cc1.depositar();
        cc1.depositar();
        cc1.sacar();

        cp1.depositar();
        cp1.depositar();
        cp1.depositar();
        cp1.sacar();
        */
        //=================================================================================================================================
        // EX 23 - Crie uma classe Dispositivo com um método conectarInternet(), e implemente Smartphone e SmartTV. 
        //=================================================================================================================================
        /*
        Smartphone smt1 = new Smartphone("Apple iPhone 15");
        SmartTV stv1 = new SmartTV("TV LG 32 HDR");

        smt1.conectarInternet();
        stv1.conectarInternet();
        */
        //=================================================================================================================================
        // EX 24 - Crie uma classe Pagamento com um método realizarPagamento(), e implemente CartaoCredito e BoletoBancario. 
        //=================================================================================================================================
        /*
        CartaoCredito CC1 = new CartaoCredito("Visa");
        BoletoBancario BP1 = new BoletoBancario();

        CC1.realizarPagamento();
        BP1.realizarPagamento();
        */
        //=================================================================================================================================
        // EX 25 - Crie uma classe Livro com um método abrir(), e implemente Ebook e LivroFisico. 
        //=================================================================================================================================
        /*
        Ebook eb1 = new Ebook("Turma da Aventura e a Máquina do Tempo", null, 0);
        Ebook eb2 = new Ebook("Carinah de Anjo: Livro Oficial da Novela", null, 0);
        LivroFisico lf1 = new LivroFisico("O Livro da Biologia", null, 0);
        LivroFisico lf2 = new LivroFisico("O Livro da Medicina", null, 0);

        eb1.abrir();
        eb2.abrir();
        lf1.abrir();
        lf2.abrir();
        */
        //=================================================================================================================================
        // EX 26 - Crie uma classe Trabalho com um método executar(), e implemente Professor e Engenheiro.  
        //=================================================================================================================================
        /*
        Professor prf1 = new Professor("Maria Alice", "PROFESSOR Titular");
        Engenheiro eng1 = new Engenheiro("Marcos José", "ENGENHEIRO Junior");

        prf1.executar();
        eng1.executar();
        */
        //=================================================================================================================================
        // EX 27 - Crie uma classe Produto com um método calcularDesconto(), e implemente Eletronico e Alimento.
        //=================================================================================================================================




        //=================================================================================================================================
        // EX 28 - CCrie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e Designer. 
        //=================================================================================================================================




        //=================================================================================================================================
        // EX 29 - Crie uma classe Aula com um método ministrar(), e implemente Matematica e Portugues.  
        //=================================================================================================================================




        //=================================================================================================================================
        // EX 30 - Crie uma classe Estoque com um método atualizarQuantidade(), e implemente Eletronicos e Roupas.
        //=================================================================================================================================
        
    

    }
}
