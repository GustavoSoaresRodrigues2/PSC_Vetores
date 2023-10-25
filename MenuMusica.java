import java.util.*;
import javax.swing.*;

public class MenuMusica {
    public static void main (String [] arg) {
        List<Musica> playlists = new ArrayList<>();
        
        String menu = "1 - Adicionar \n" + 
                      "2 - Ver a Lista \n" + 
                      "0 - Sair";
        int op;

        do {
            op = Integer.parseInt(
                JOptionPane.showInputDialog(
                    null, 
                    menu, 
                    "Musica", 
                    3
                )
            );
            
                switch (op) {
                    case 1: {
                        String title = JOptionPane.showInputDialog(
                            null, 
                            "Titulo? :", 
                            "Titulo da Musica", 
                            1
                        );

                        var musica = new Musica(title);
                        playlists.add(musica); }
                        break;

                    case 2:
                        StringBuilder sb = new StringBuilder("");

                        Collections.sort(
                            playlists,
                            new Comparator <Musica> () {
                                public int compare(Musica m1, Musica m2) {
                                    if (m1.getAvaliacao() < m2.getAvaliacao()) {
                                        return 1;
                                    } else if (m1.getAvaliacao() > m2.getAvaliacao()) {
                                        return 2;
                                    } else {
                                        return 0;
                                    }
                                }
                            }
                        );

                        for (Musica musica : playlists) {
                            sb.append(musica.getTitulo());
                            sb.append("\n");
                        }

                        JOptionPane.showMessageDialog(
                            null, 
                            sb.toString(), 
                            "Playlists", 
                            1
                        );
                        break;
                
                    default:
                        break;
                }

        } while (op != 0);
    }
}