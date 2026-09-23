import javax.swing.*;

public class EntradaSaidaDados {

    public String entradadados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    public void saidaDados (String mensagemSaida){
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
