import java.util.Random;
import javax.swing.JOptionPane;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        var vetor = new VetorDinamico();
        var gerador = new Random();

        while (true) {
            int dado = gerador.nextInt(6) + 1;
            vetor.AdicaoElemento(dado);
            // vetor.AdicaoElemento(Integer.parseInt(JOptionPane.showInputDialog("Coloque: ")));
            vetor.Exibir();
            System.out.println("\n -----------------------------");
            Thread.sleep(5000);
        }
    }
}