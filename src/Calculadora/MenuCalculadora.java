public class MenuCalculadora {

    //Declarando os atributos que vão ser utilizados nessa classe, alguns são objetos,
    // pois assim podemos chamar os métodos de outras classes para o menu funcionar
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;

    // Construtor que inicializa todos os objetos utilizados pela calculadora
    public MenuCalculadora() {
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }

    // Mantém a calculadora rodando até o usuário escolher sair
    public void executarCalculadora() {
        do {
            this.executarMenuPrincipal();   // Exibe o menu e captura a opção escolhida
            this.avaliarOpcaoEscolhida();  // Recebe os dois números e executa a operação correspondente à opção
        } while (this.opcao != 0);
    }

    // Exibe o menu e converte a opção digitada para número inteiro
    private void executarMenuPrincipal() {
        String mensagemMenu = "Selecione uma opção "
                + "\n 1 - Somar"
                + "\n 2 - Subtrair"
                + "\n 3 - Multiplicar"
                + "\n 4 - Dividir "
                + "\n 5 - Sair";
        String entradaDados = io.entraDadados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }

    //Recebe os dois números, avalia a opção escolhida e executa respectiva ação
    public void avaliarOpcaoEscolhida() {
        String saida;
        double num1 = 0, num2 = 0;

        // Pede os dois números ao usuário
        if (this.opcao != 0 && this.opcao <= 4) {

            String mensagemEntrada = "Digite o 1º numero";
            num1 = conversor.stringToDouble(io.entraDadados(mensagemEntrada));
            calculadora.setNumero01(num1);

            mensagemEntrada = "Digite o 2º numero";
            num2 = conversor.stringToDouble(io.entraDadados(mensagemEntrada));
            calculadora.setNumero02(num2);
        }

        //Executa as operações matemáticas, ou encerra o programa
        switch (this.opcao) {
            case 1:
                calculadora.somar(num1, num2);
                saida = "Resultado da soma: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;

            case 2:
                calculadora.subtrair(num1, num2);
                saida = "Resultado da subtração: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;

            case 3:
                calculadora.multiplicar(num1, num2);
                saida = "Resultado da multiplicação: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;

            case 4:
                calculadora.dividir(num1, num2);
                saida = "Resultado da Divisão: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;

            case 5:
                calculadora.sair();

            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
}

