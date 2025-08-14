package conceitos;

import javax.swing.JOptionPane;

public class ConversaoNumero{
    public static void main(String[] args) {

        //JOptionPane.showInputDialog abre uma janela 

        String a = JOptionPane.showInputDialog("Import arrays: ");
        String b = JOptionPane.showInputDialog("");

        System.out.println(a + b);

        double c = Double.parseDouble(a);
        double d = Double.parseDouble(b);

        System.out.println("A soma é igual a " + (c + d));
        System.out.println("A divisão desses números é igual a " + c / d);        
    }
}