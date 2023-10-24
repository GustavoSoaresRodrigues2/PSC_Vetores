import javax.swing.JOptionPane;

public class ExVetores {
    public static void main(String[] args) {
        String [] nomes = new String [11];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nome: ");
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
