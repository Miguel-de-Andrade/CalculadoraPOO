import javax.swing.*;

//Classe responsável pela entrada e saída de dados utilizando o JOptioPane
public class EntradaSaidaDados {

    //Método esponsável por exibir uma mensagem na tela e receber um dado
    public String entraDadados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    //Método responsável por exibir uma mensagem na tela
    public void saidaDados (String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
