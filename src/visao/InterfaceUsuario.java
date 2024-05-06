package visao;

import javax.swing.JOptionPane;

import modelagem.Computador;
import negocio.Armazenamento;



public class InterfaceUsuario {
    public static void main(String[] args) {
        Armazenamento armazenamento = new Armazenamento();
        
        while (true) {
            String marca = JOptionPane.showInputDialog("Digite a marca do computador:");
            String modelo = JOptionPane.showInputDialog("Digite o modelo do computador:");
            
            Computador computador = new Computador(marca, modelo);
            armazenamento.empilharComputador(computador);
            
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro computador?");
            if (resposta != JOptionPane.YES_OPTION) {
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Computadores empilhados com sucesso!");
        
        while (!armazenamento.getPilhaComputadores().isEmpty()) {
            Computador computador = armazenamento.desempilharComputador();
            JOptionPane.showMessageDialog(null, "Computador desempilhado:\nMarca: " + computador.getMarca() + "\nModelo: " + computador.getModelo());
        }
    }
}