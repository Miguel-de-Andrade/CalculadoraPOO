public class Calculadora {

    //Declara os atributos que armazenam os dois números e o resultado
    private double numero01;
    private double numero02;
    private double resultado;

    //Construtor que inicia o objeto com os 3 atributos com o valor 0
    public Calculadora() {
        this(0,0,0);
    }

    // Construtor que já recebe os valores dos três atributos
    public Calculadora(double numero01, double numero02, double resultado){
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }


    // Retorna o valor armazenado em numero01
    public double getNumero01() {
        return numero01;
    }

    // Altera o valor de numero01
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    // Retorna o valor armazenado em numero02
    public double getNumero02() {
        return numero02;
    }

    // Altera o valor de numero02
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    // Retorna o valor armazenado em resultado
    public double getResultado() {
        return resultado;
    }

    // Altera o valor de resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    //Realiza a soma dos dois números e armazena o resultado no atributo
    //resultado
    public void somar(double numero01, double numero02) {
        setResultado(this.getNumero01() + this.getNumero02());
    }

    //Realiza a subtração dos dois números e armazena o resultado no atributo
    //resultado
    public void subtrair(double numero01, double numero02) {
        setResultado(this.getNumero01() - this.getNumero02());
    }

    //Realiza a multiplicação dos dois números e armazena o resultado no atributo
    //resultado
    public void multiplicar(double numero01, double numero02) {
        setResultado(this.getNumero01() * this.getNumero02());
    }

    //Realiza a divisão dos dois números e armazena o resultado no atributo
    //resultado
    public void dividir(double numero01, double numero02) {
        setResultado(this.getNumero01() / this.getNumero02());
    }

    //Encerra a execução do programa
    public void sair() {
        System.exit(0);
    }
}






